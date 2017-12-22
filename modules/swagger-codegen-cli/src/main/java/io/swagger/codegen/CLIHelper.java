package io.swagger.codegen;

import com.google.common.io.Resources;
import io.swagger.oas.models.media.ArraySchema;
import io.swagger.oas.models.media.BooleanSchema;
import io.swagger.oas.models.media.IntegerSchema;
import io.swagger.oas.models.media.NumberSchema;
import io.swagger.oas.models.media.Schema;
import io.swagger.parser.v3.util.SchemaTypeUtil;
import org.apache.commons.io.Charsets;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CLIHelper {

    static String loadResourceOAS3File() {
        URL url = Resources.getResource("oas3.yaml");
        try {
            return Resources.toString(url, Charsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static boolean containsOptionExtensions(Map<String, Object> extensions) {
        if(extensions == null) {
            return false;
        }
        final Object option = extensions.get("x-option");
        if(option != null && StringUtils.isNotBlank(option.toString())) {
            return true;
        }
        return false;
    }

    static String getCommand(String schemaName, Schema schema) {
        if(schema.getExtensions() != null && !schema.getExtensions().isEmpty() && schema.getExtensions().get("x-command") != null) {
            return schema.getExtensions().get("x-command").toString();
        } else {
            return schemaName.toLowerCase();
        }
    }

    static String[] getArguments(Map<String, Object> extensions) {
        if(extensions.get("x-short-version") != null && StringUtils.isNotBlank(extensions.get("x-short-version").toString())) {
            return new String[] {extensions.get("x-short-version").toString(), extensions.get("x-option").toString()};
        }
        return new String[] {extensions.get("x-option").toString()};
    }

    static String detectCommand(String[] args) {
        if(args == null || args.length == 0) {
            return null;
        }
        String command = args[0];
        if(StringUtils.isBlank(command) || command.startsWith("-")) {
            return null;
        }
        return command;
    }

    static Class getClass(Schema property) {
        if(property instanceof BooleanSchema) {
            return Boolean.class;
        }
        return String.class;
    }

    static Object getDefault(Schema property) {
        if(property instanceof BooleanSchema) {
            return Boolean.TRUE;
        }
        return null;
    }

    static Map<String, Object> createOptionValueMap(Schema schema, Map<String, Object> inputArgs) {
        if(inputArgs == null || inputArgs.isEmpty()) {
            return null;
        }
        final Map<String, Schema> properties = schema.getProperties();
        if(properties == null || properties.isEmpty()) {
            return null;
        }
        final Map<String, Object> optionValueMap = new HashMap<>();
        for(String propertyName : properties.keySet()) {
            final Schema property = properties.get(propertyName);
            final Map<String, Object> extensions = property.getExtensions();
            if(extensions == null || extensions.isEmpty()) {
                continue;
            }
            Object value = null;
            if(extensions.get("x-option") != null) {
                String option = fixOptionName(extensions.get("x-option").toString());
                value = inputArgs.get(option);
            } else {
                continue;
            }
            if(value == null) {
                continue;
            }
            if(property instanceof BooleanSchema) {
                optionValueMap.put(propertyName, Boolean.valueOf(value.toString()));
            }
            else if(property instanceof IntegerSchema) {
                if(SchemaTypeUtil.INTEGER64_FORMAT.equals(property.getFormat())) {
                    optionValueMap.put(propertyName, Long.valueOf(value.toString()));
                } else {
                    optionValueMap.put(propertyName, Integer.valueOf(value.toString()));
                }
            }
            else if(property instanceof NumberSchema) {
                if(SchemaTypeUtil.FLOAT_FORMAT.equals(property.getFormat())) {
                    optionValueMap.put(propertyName, Float.valueOf(value.toString()));
                } else {
                    optionValueMap.put(propertyName, Double.valueOf(value.toString()));
                }
            }
            else if(property instanceof ArraySchema) {
                String inputElements = value.toString()
                        .replace("[", StringUtils.EMPTY)
                        .replace("]", StringUtils.EMPTY)
                        .replace(" ", StringUtils.EMPTY);
                final List<String> values = new ArrayList<>(Arrays.asList(inputElements.split(",")));
                optionValueMap.put(propertyName, values);
            }
            else {
                optionValueMap.put(propertyName, value);
            }
        }
        return optionValueMap;
    }

    private static String fixOptionName(String option) {
        option = option.substring(countDashes(option));
        return option.replace("-", "_");
    }

    private static int countDashes(String option) {
        for(int i = 0; i < option.length(); i++) {
            if(option.charAt(i) != '-') {
                return i;
            }
        }
        return 0;
    }
}

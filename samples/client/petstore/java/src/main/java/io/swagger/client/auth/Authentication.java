package io.swagger.client.auth;

import java.util.Map;

public interface Authentication {
  void processParams(Map<String, String> queryParams, Map<String, String> headerParams);
}

# Swagger Code Generator

[![Build Status](https://travis-ci.org/wordnik/swagger-codegen.png)](https://travis-ci.org/wordnik/swagger-codegen)

## Overview
This is the swagger codegen project, which allows generation of client libraries automatically from a Swagger-compliant server.  

## What's Swagger?

The goal of Swagger™ is to define a standard, language-agnostic interface to REST APIs which allows both humans and computers to discover and understand the capabilities of the service without access to source code, documentation, or through network traffic inspection. When properly defined via Swagger, a consumer can understand and interact with the remote service with a minimal amount of implementation logic. Similar to what interfaces have done for lower-level programming, Swagger removes the guesswork in calling the service.


Check out [Swagger-Spec](https://github.com/wordnik/swagger-spec) for additional information about the Swagger project, including additional libraries with support for other languages and more. 


## Compatability
The Swagger Specification has undergone 3 revisions since initial creation in 2010.  The swagger-codegen project has the following compatibilies with the swagger specification:

Swagger Codegen Version | Release Date | Swagger Spec compatability | Notes
----------------------- | ------------ | -------------------------- | -----
2.1.0 (in development)  | n/a          | 2.0           | [branch develop_2.0](https://github.com/wordnik/swagger-codegen/tree/develop_2.0)
2.0.17                  | 2014-08-22   | 1.1, 1.2      | [tag v2.0.17](https://github.com/wordnik/swagger-codegen/tree/v2.0.17)
1.0.4                   | 2012-04-12   | 1.0, 1.1      | [tag v1.0.4](https://github.com/wordnik/swagger-codegen/tree/swagger-codegen_2.9.1-1.1)


### Prerequisites
You need the following installed and available in your $PATH:

* [Java 1.7](http://java.oracle.com)

Note!  Some folks have had issues with OOM errors with java version "1.6.0_51".  It's strongly suggested that you upgrade to 1.7!

* [Apache maven 3.0.3 or greater](http://maven.apache.org/)

After cloning the project, you can build it from source with this command:

```
mvn package
```

### To generate a sample client library
You can build a client against Wordnik's [petstore](http://petstore.swagger.wordnik.com) API as follows:

```
./bin/java-petstore.sh
```

This will run the generator with this command:

```
java -cp ./target/*:./target/lib/* com.wordnik.swagger.codegen.Codegen \
  -i http://petstore.swagger.wordnik.com/v2/swagger.json \
  -l java \
  -o samples/client/petstore/java
```

With a number of options.  You can get the options with the -h flag:
```
usage: Codegen
 -i,--input-spec <arg>     location of the swagger spec, as URL or file
 -l,--lang <arg>           client language to generate
 -o,--output <arg>         where to write the generated files
 -t,--template-dir <arg>   folder containing the template files
 ```

You can then compile and run the client, as well as unit tests against it:

```
cd samples/client/petstore/java
mvn package
```

Other languages have petstore samples, too:
```
./bin/java-petstore.sh
./bin/objc-petstore.sh
```

### Generating libraries from your server
It's just as easy--just use the `-i` flag to point to either a server or file.

### Modifying the client library format
Don't like the default swagger client syntax?  Want a different language supported?  No problem!  Swagger codegen processes mustache templates with the [jmustache](https://github.com/samskivert/jmustache) engine.  You can modify our templates or make your own.

You can look at `src/main/resources/${your-language}` for examples.  To make your own templates, create your own files and use the `-t` flag to specify your tempalte folder.  It actually is that easy.

### Where is Javascript???
See our [javascript library](http://github.com/wordnik/swagger.js)--it's completely dynamic and doesn't require
static code generation.
There is a third-party component called [swagger-js-codegen](https://github.com/wcandillon/swagger-js-codegen) that can generate angularjs or nodejs source code from a swagger specification.


#### Generating a client from flat files (i.e. no remote server calls)
If you don't want to call your server, you can save the swagger spec files into a directory and pass an argument
to the code generator like this:

```
-i ./src/test/resources/petstore.json
```

Or for example:
```
./bin/java-petstore-filemap.sh
```

Great for creating libraries on your ci server, from the [Swagger Editor](http://editor.swagger.wordnik.com)... or while coding on an airplane.

### Validating your swagger spec

You have options.  The easiest is to use our [online validator](https://github.com/swagger-api/validator-badge) which not only will let you validate your spec, but with the debug flag, you can see what's wrong with your spec.  For example:

http://online.swagger.io/validator/debug?url=http://petstore.swagger.wordnik.com/v2/swagger.json

### Generating static api documentation

#### Not yet migrated to this branch

### To build a server stub

You can also use the codegen to generate a server for a couple different frameworks.  Take a look here:

#### Not yet migrated to this branch
* [javascript node.js Server generator](https://github.com/wordnik/swagger-codegen/tree/master/samples/server-generator/node)

#### Not yet migrated to this branch
* [ruby sinatra generator](https://github.com/wordnik/swagger-codegen/tree/master/samples/server-generator/sinatra)

#### Not yet migrated to this branch
* [scala scalatra generator](https://github.com/wordnik/swagger-codegen/tree/master/samples/server-generator/scalatra)

* java jax-rs

To do so, just use the `-l jaxrs` flag when reading a spec file~

### To build the codegen library

This will create the swagger-codegen library from source.  

```
mvn package
```

Note!  The templates are included in the library generated.  If you want to modify the templates, you'll need to either repackage the library OR specify a path to your scripts

License
-------

Copyright 2014 Reverb Technologies, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at [apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

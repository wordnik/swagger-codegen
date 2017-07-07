lazy val root = (project in file(".")).
  settings(
    organization := "io.swagger",
    name := "swagger-petstore-jersey2-java6",
    version := "1.0.0",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.15",
      "org.glassfish.jersey.core" % "jersey-client" % "2.25.1",
      "org.glassfish.jersey.media" % "jersey-media-multipart" % "2.25.1",
      "org.glassfish.jersey.media" % "jersey-media-json-jackson" % "2.25.1",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.8.9",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.8.9",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.9",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % "2.8.9",
      "joda-time" % "joda-time" % "2.9.9",
      "com.brsanthu" % "migbase64" % "2.2",
      "org.apache.commons" % "commons-lang3" % "3.6",
      "commons-io" % "commons-io" % "2.5",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )

# CDI Failure with Composite Gradle Build

The following error occurs when running `./gradlew :services:quarkus-service:test`

```java
> Task :services:quarkus-service:test

AuthTokenConsumerTest > testFn() FAILED
    java.lang.RuntimeException at QuarkusTestExtension.java:625
        Caused by: java.lang.RuntimeException at AugmentActionImpl.java:335
            Caused by: io.quarkus.builder.BuildException at Execution.java:123
                Caused by: javax.enterprise.inject.spi.DeploymentException at BeanDeployment.java:1223
                    Caused by: javax.enterprise.inject.UnsatisfiedResolutionException at Beans.java:440

1 test completed, 1 failed

> Task :services:quarkus-service:test FAILED

FAILURE: Build failed with an exception.

```

This is a simple gradle composite build project composed of libraries and services
The auth library provides a bean (AuthTokenProvider) that we want to inject in our service

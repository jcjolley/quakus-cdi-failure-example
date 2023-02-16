pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories { mavenCentral() }
}

includeBuild("../libraries")

// == Define the inner structure of this component ==
rootProject.name = "services"
include(
    "quarkus-service",
)
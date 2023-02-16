pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories { mavenCentral() }
}


// == Define the inner structure of this component ==
rootProject.name = "libraries"
include(
    "auth",
)


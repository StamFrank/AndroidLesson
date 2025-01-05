pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Android Lesson"
include(":app")
include(":p0031-1firstproject")
include(":p0041basicviews")
include(":p0041-1basicviews")
include(":p0041-2basicviews")
include(":p0051layoutfiles")
include(":p00511layoutfiles")
include(":app:p0101_listener")
include(":p0101_listener")
include(":P00101_Listener")
include(":P0091_OnClickButtons")

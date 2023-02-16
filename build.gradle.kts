// This is an example of a lifecycle task that crosses build boundaries defined in the umbrella build.
tasks.register("checkFeatures") {
    group = "verification"
    description = "Run all feature tests"
}

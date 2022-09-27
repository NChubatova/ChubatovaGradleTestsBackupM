import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.buildFeatures.parallelTests
import jetbrains.buildServer.configs.kotlin.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot


version = "2022.04"

project {

    vcsRoot(HttpsGithubComChubatovaTigerDotNetTestsSamples)

    buildType(Cba_4)

    params {
        param("projpar", "b4-ranch")
    }
}

object Cba_4 : BuildType({
    id("Cba")
    name = "cba"

    artifactRules = "parsec*=>."
    buildNumberPattern = "%build.counter%-b4-ranch"

    params {
        param("aa", "b4-ranch")
        param("env.env", "envb4ranch")
        password("parsec", "credentialsJSON:6f0b7139-8ec4-401c-bd16-d847f78387a9")
    }

    vcs {
        root(DslContext.settingsRoot)
        root(HttpsGithubComChubatovaTigerDotNetTestsSamples)
    }

    steps {
        gradle {
            tasks = "clean build"
            gradleWrapperPath = ""
        }
        script {
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptContent = "echo b4ranch"
        }
        script {
            name = "New build step"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptContent = "echo %parsec% > parsecb4ranch.txt"
        }
        script {
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptContent = "exit 1"
        }
    }

    failureConditions {
        testFailure = false
        nonZeroExitCode = false
    }

    features {
        parallelTests {
            numberOfBatches = 3
        }
        commitStatusPublisher {
            vcsRootExtId = "${DslContext.settingsRoot.id}"
            publisher = github {
                githubUrl = "https://api.github.com"
                authType = personalToken {
                    token = "credentialsJSON:25aa9774-b33d-4ec7-9045-8ec357f54265"
                }
            }
        }
    }

    requirements {
        contains("teamcity.agent.name", "nc")
    }
})

object HttpsGithubComChubatovaTigerDotNetTestsSamples : GitVcsRoot({
    name = "https://github.com/ChubatovaTiger/DotNetTestsSamples"
    url = "https://github.com/ChubatovaTiger/DotNetTestsSamples"
    branch = "refs/heads/master"
})

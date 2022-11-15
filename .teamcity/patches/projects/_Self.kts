package patches.projects

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.projectFeatures.YouTrackIssueTracker
import jetbrains.buildServer.configs.kotlin.projectFeatures.s3Storage
import jetbrains.buildServer.configs.kotlin.projectFeatures.youtrack
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the root project
accordingly, and delete the patch script.
*/
changeProject(DslContext.projectId) {
    features {
        val feature1 = find<YouTrackIssueTracker> {
            youtrack {
                id = "PROJECT_EXT_4"
                displayName = "dsplname"
                host = "http://localhost:8111"
                userName = ""
                password = ""
                projectExtIds = "TW"
                accessToken = "credentialsJSON:5f5aa34c-94be-48a4-9940-b0da5c3e7ed8"
            }
        }
        feature1.apply {
        }
        add {
            s3Storage {
                id = "PROJECT_EXT_5"
                bucketName = "chubatovatransferacceleration"
                awsEnvironment = default {
                    awsRegionName = "eu-central-1"
                }
                accessKeyID = "AKIA5JH2VERVHVMPJQJI"
                accessKey = "credentialsJSON:ac8d0774-e888-4d58-bdce-0e22b504fa48"
            }
        }
    }
}

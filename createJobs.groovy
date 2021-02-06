// pipelineJob('pipelineJob') {
//     definition {
//         cps {
//             script(readFileFromWorkspace('pipelineJob.groovy'))
//             sandbox()
//         }
//     }
// }

// pipelineJob('theme-park-job') {
//     definition {
//         cpsScm {
//             scm {
//                 git {
//                     remote {
//                        github('elallaoui-m/spring-demo')
//                        credentials('tmp-creds') 
//                     }
//                     branch 'master'
//                 }
//             }
//             triggers {
//                 githubPush()
//             }
//         }
//     }
// }

pipelineJob('cmi-service') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                       github('ENSAPAY/CMI')
                       credentials('tmp-creds') 
                    }
                    branch 'master'
                }
            }
            triggers {
                githubPush()
            }
        }
    }
}

pipelineJob('backoffice-service') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                       github('ENSAPAY/BackOfficeBack')
                       credentials('tmp-creds') 
                    }
                    branch 'master'
                }
            }
            triggers {
                githubPush()
            }
        }
    }
}

pipelineJob('redal-service') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                       github('ENSAPAY/redal-nest')
                       credentials('tmp-creds') 
                    }
                    branch 'main'
                }
            }
            triggers {
                githubPush()
            }
        }
    }
}
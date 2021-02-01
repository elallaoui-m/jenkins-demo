pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                       github('elallaoui-m/spring-demo','ssh')
                       credentials('tmp-creds') 
                    }
                    branch 'master'
                }
            }
        }
    }
}
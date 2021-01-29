pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/elallaoui-m/spring-demo.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
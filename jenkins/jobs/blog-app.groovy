pipelineJob('Blogs/blog-app') {


    description(
        'Generated automatically by DevOps Platform'
    )


    definition {


        cpsScm {


            scm {


                git {


                    remote {


                        url('https://github.com/akashnegi62/blog-app.git')


                        credentials('github-token')


                    }


                    branch('main')


                }


            }


            scriptPath('Jenkinsfile')


        }


    }


}
def gv

pipeline {
  
  agent any
  
    parameters {
      choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
      booleanParam(name: 'executeTests', defaultValue: true, description: '') 
    
    }
  environment {
    SERVER_CREDENTIALS = credentials ('da0b8891-c80c-4073-91b9-d91fb46849d2')
  }  
  
  stages {
    
    stage("init") {
      steps {
        script{
          gv= load "script.groovy"
        }
        echo 'building the application...'
        echo 'changed now'
      }
    }
    stage("build"){
      steps{
        script{
          gv.buildApp()
        }
      }
    }
   
    stage("test") {
      steps {
        
        scrip{
          gv.testApp()
        }
      }
    }
    stage("deploy"){
      
      steps {
        script{
          gv.deployApp()
        }
        
      }
    }
  }
  }

pipeline {
      agent any
   stages{
      stage('Compile-Package'){
         steps{
           withMaven(maven : 'maven_3_6_0'){
               sh 'mvn package'
          }
         }
       }
       stage('Compile Stage'){
         steps{
           withMaven(maven : 'maven_3_6_0'){
               sh 'mvn clean compile'
          }
         }
       }
    }
}

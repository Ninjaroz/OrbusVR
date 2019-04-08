pipeline {
      agent any
   stages{
      stage('SCM Checkout'){
         steps{
            git 'https://github.com/Ninjaroz/OrbusVR'
         }
      }
      stage('Compile-Package'){
         steps{
           withMaven(maven : 'maven_3_6_0'){
               sh 'mvn package'
          }
         }
      }
  }
}

node {
   agent any
   stages{
      stage('Checkout'){
       git 'https://github.com/Ninjaroz/OrbusVR'
      }
      stage('Compile-Package'){
        withMaven(maven : 'maven_3_6_0'){
        sh 'mvn package'
       }
      }
      stage('Compile Stage'){
       withMaven(maven : 'maven_3_6_0'){
        sh 'mvn clean compile'
       }
      }
      stage('testing Stage'){
       withMaven(maven : 'maven_3_6_0'){
         sh 'mvn test'
       }
      }
      stage('Deployment Stage'){
        withMaven(maven : 'maven_3_6_0'){
          sh 'mvn deploy'
        }
      }
   }
}

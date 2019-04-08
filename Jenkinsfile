pipeline {
	agent any
	environment {
		PATH = "C:\Program Files\Git\bin"
		stages{
			stage('Checkout'){
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
			stage('Compile Stage'){
				steps{
					withMaven(maven : 'maven_3_6_0'){
						sh 'mvn clean compile'
					}
				}
			}
			stage('Testing Stage'){
				steps{
					withMaven(maven : 'maven_3_6_0'){
						sh 'mvn test'
					}
				}
			}
			stage('Deployment Stage'){
				steps{
					withMaven(maven : 'maven_3_6_0'){
						sh 'mvn deploy'
					}
				}
			}	
		}
	}
}

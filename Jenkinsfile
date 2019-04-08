pipeline {
	/*environment{
		mklink  "C:\\Program Files\\Git\\bin\\nohup.exe" "C:\\Program Files\\git\\usr\\bin\\nohup.exe"
		mklink  "C:\\Program Files\\Git\\bin\\msys-2.0.dll" "C:\\Program Files\\git\\usr\\bin\\msys-2.0.dll"
		mklink  "C:\\Program Files\\Git\\bin\\msys-iconv-2.dll" "C:\\Program Files\\git\\usr\\bin\\msys-iconv-2.dll"
		mklink  "C:\\Program Files\\Git\\bin\\msys-intl-8.dll" "C:\\Program Files\\git\\usr\\bin\\msys-intl-8.dll"
	}*/
	agent any
	stages{
		stage('Checkout'){
			steps{
				git 'https://github.com/Ninjaroz/OrbusVR'
			}
		}
		/*stage('Compile-Package'){
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
		}*/
		stage('Deployment Stage'){
			steps{
				withMaven(maven : 'maven_3_6_0'){
					sh 'mvn deploy'
				}
			}
		}	
	}
}

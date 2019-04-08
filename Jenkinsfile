pipeline {
	agent any
	stages{
		stage('Checkout'){
			steps{
				git 'https://github.com/Ninjaroz/OrbusVR'
			}
		}
		stage('Compile-Package'){
			steps{
				withMaven(maven : 'maven_3_6_0'){
					def mvnHome = tool name: 'maven_3_6_0', type: 'maven'
					sh "${mvnHome}/bin/mvn package"
				}
			}
		}	
	}
}

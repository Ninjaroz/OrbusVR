pipeline {
	agent any
	stages{
		stage('Checkout'){
			steps{
				git 'https://github.com/Ninjaroz/OrbusVR'
			}
		}
		stage('Compile-Package'){
			def mvnHome = tool name: 'maven_3_6_0', type: 'maven'
			steps{
				withMaven(maven : 'maven_3_6_0'){
					sh "${mvnHome}/bin/mvn package"
				}
			}
		}	
	}
}

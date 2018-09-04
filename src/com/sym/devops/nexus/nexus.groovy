package com.sym.devops.nexus

def DeployonNexus(String NEXUS_PATH)
{
    try {
      
    }
    catch (Exception error) {
        wrap([$class: 'AnsiColorBuildWrapper']) {
           println "\u001B[41m[ERROR] failed to store on Artifactory ${NEXUS_PATH}..."
		   currentBuild.result = 'FAILED'
           throw error
        }
    }
}



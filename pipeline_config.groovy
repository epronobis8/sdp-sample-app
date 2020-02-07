libraries{
  sdp{
      protractor {
     url = "localhost:9000"
     enforce = true
     config_file = "protractor.conf.js"
    }
  
    images{
      registry = "http://0.0.0.0:5000" // registry url
      cred = "sdp-docker-registry"// jenkins cred id to authenticate
      docker_args = "--network=try-it-out_sdp"  // docker runtime args
    }
  } 
  }
  github_enterprise
  sonarqube{
    enforce_quality_gate = true
  }
  docker{
    registry = "0.0.0.0:5000"
    cred = "sdp-docker-registry"
  }
}
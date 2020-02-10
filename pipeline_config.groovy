
libraries{
  sdp{
    images{
      registry = "http://0.0.0.0:5000" // registry url
      cred = "sdp-docker-registry"// jenkins cred id to authenticate
      docker_args = "--network=try-it-out_sdp"  // docker runtime args

      owasp_dep_check {
      scan_target = "src"
      cvss_threshold = "9"
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

libraries{
  sdp{
    images{
      registry = "https://docker.pkg.github.com"
      repository = "boozallen/sdp-images"
      cred = "github-token"
      docker_args = "--network host"
    }
  }
  github_enterprise
  sonarqube{
    enforce_quality_gate = true
  }
  owasp_dep_check {
    scan_target = "src"
    cvss_threshold = "9"
  }
  docker{
    registry = "0.0.0.0:5000"
    cred = "sdp-docker-registry"
  }
}
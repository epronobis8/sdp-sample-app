libraries{
    sdp{
      images{
          registry = "https://docker.pkg.github.com"
          repository = "boozallen/sdp-images"
          cred = "github"
            }
    }
      github_enterprise
      sonarqube{
    enforce_quality_gate = true
  }
}

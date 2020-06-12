libraries{
    sdp{
      images{
          registry = "https://docker.pkg.github.com"
          repository = "boozallen/sdp-images"
          cred = "github"
      }
    }
libraries{
  sonarqube{
    credential_id = "sonarqube"
  }
}
    owasp_zap{
        target = "https://example.com"
    }
}

libraries{
    sdp{
      images{
          registry = "https://docker.pkg.github.com"
          repository = "boozallen/sdp-images"
          cred = "github"
      }
    }
    github_enterprise
  owasp_dep_check {
    scan_target = "src"
    cvss_threshold = "9"
  }
    owasp_zap{
        target = "https://example.com"
    }
}
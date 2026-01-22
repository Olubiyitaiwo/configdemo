package org.ecommerce.configdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildInfoController {

    @Value("${BUILD_ID:default}")
    private String buildId;

    @Value("${BUILD_VERSION:default}")
    private String buildVersion;

    @Value("${BUILD_NAME:default}")
    private String buildName;

    @GetMapping("/build-info")
    public String getBuildInfo() {
        return "Build ID: " + buildId +
                ", Version: " + buildVersion +
                ", Name: " + buildName;
    }
}


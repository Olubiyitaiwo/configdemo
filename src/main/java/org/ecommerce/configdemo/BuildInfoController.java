package org.ecommerce.configdemo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BuildInfoController {

//    @Value("${ID:default}")
//    private String buildId;
//
//    @Value("${VERSION:default}")
//    private String buildVersion;
//
//    @Value("${NAME:default}")
//    private String buildName;

    private BuildInfo buildInfo;

    @GetMapping("/build-info")
    public String getBuildInfo() {
        return "Build ID: " + buildInfo.getId() +
                ", Version: " + buildInfo.getVersion() +
                ", Name: " + buildInfo.getName();
    }
}

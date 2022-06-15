package com.honedu.demo1;


import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test {
    @Resource
    private MiaoSyncApiClient miaoSyncApiClient;

    @Operation(summary = "测试接口")
    @RequestMapping("/test")
    public String home() {
        return miaoSyncApiClient.getNameByOrgId();
    }

}

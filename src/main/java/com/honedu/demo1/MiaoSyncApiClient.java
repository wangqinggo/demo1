package com.honedu.demo1;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test", url = "${test.url}", fallbackFactory = MiaoSyncApiFallback.class, path = "/")
public interface MiaoSyncApiClient {

    @GetMapping("/")
    String getNameByOrgId();
}

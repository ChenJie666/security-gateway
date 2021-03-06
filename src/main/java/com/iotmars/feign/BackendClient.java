package com.iotmars.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Set;

/**
 * 获取黑名单
 */
@FeignClient("manage-backend")
public interface BackendClient {

    @GetMapping("/feign/user/blackList")
    Set<String> findAllBlackIPs(@RequestParam("params") Map<String, Object> params);

}

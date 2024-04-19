package com.chunping.springcloud.service;

import com.chunping.springcloud.entities.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "CLOUD-GATEWAY-LOGIN-SERVICE")
public interface LoginFeignService {

    @PostMapping(value = "/loginservice/route1/login")
    String loginRoute1(@RequestBody Account account);

    @PostMapping(value = "/loginservice/route2/login")
    String loginRoute2(@RequestBody Account account);

    @PostMapping(value = "/loginservice/route3/login")
    String loginRoute3(@RequestBody Account account);
}

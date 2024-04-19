package com.chunping.springcloud.controller;

import com.chunping.springcloud.entities.Account;
import com.chunping.springcloud.service.LoginFeignService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GatewayLoginController {

    @Resource
    LoginFeignService loginFeignService;

    @GetMapping(value = "/loginservice/route1/login")
    public String loginRoute1(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        return loginFeignService.loginRoute1(account);
    }

    @GetMapping(value = "/loginservice/route2/login")
    public String loginRoute2(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        return loginFeignService.loginRoute2(account);
    }

    @GetMapping(value = "/loginservice/route3/login")
    public String loginRoute3(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        return loginFeignService.loginRoute2(account);
    }
}

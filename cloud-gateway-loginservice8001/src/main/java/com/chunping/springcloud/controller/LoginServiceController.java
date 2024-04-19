package com.chunping.springcloud.controller;

import com.chunping.springcloud.entities.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class LoginServiceController {


    @GetMapping(value = "/loginservice/route1/login")
    public String loginRoute1(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        log.info("login route1 username:{},password:{}", account.getUsername(), account.getPassword());
        return String.format("login route1 OK username:%s,password:%s", account.getUsername(), account.getPassword());
    }

    @GetMapping(value = "/loginservice/route2/login")
    public String loginRoute2(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        log.info("login route2 username:{},password:{}", account.getUsername(), account.getPassword());
        return String.format("login route2 OK username:%s,password:%s", account.getUsername(), account.getPassword());
    }

    @GetMapping(value = "/loginservice/route3/login")
    public String loginRoute3(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        log.info("login route3 username:{},password:{}", account.getUsername(), account.getPassword());
        return String.format("login route3 OK username:%s,password:%s", account.getUsername(), account.getPassword());
    }
}

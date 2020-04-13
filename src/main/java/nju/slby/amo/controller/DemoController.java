package nju.slby.amo.controller;

import nju.slby.amo.model.Demo;
import nju.slby.amo.model.ResultMessage;
import nju.slby.amo.service.DemoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping(value = "demo")
public class DemoController {

    @Resource(name = "demoService")
    private DemoService demoService;

    @RequestMapping(value = "/login")
    public ResultMessage login(@RequestBody Demo demo){
        return demoService.login(demo);
    }

    @RequestMapping(value = "/register")
    public ResultMessage register(@RequestBody Demo demo){
        System.out.println("success");
        System.out.println(demo.getUsername());
        System.out.println(demo.getPassword());
//        return new ResultMessage(true,"注册成功");
        return demoService.register(demo);
    }
}

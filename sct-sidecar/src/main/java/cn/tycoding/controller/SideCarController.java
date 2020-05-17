package cn.tycoding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SideCarController
 * @Description
 * @Author rukangz
 * @Date 2019/10/21
 **/
@RestController
@RequestMapping
public class SideCarController {

    @GetMapping("/getUser")
    public String getUser(){
        return "ok";
    }
}

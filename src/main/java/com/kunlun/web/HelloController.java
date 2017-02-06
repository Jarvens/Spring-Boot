package com.kunlun.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kunlun on 2017/2/6.
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index() {
        return "Hello";
    }
}

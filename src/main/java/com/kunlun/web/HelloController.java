package com.kunlun.web;

import com.kunlun.config.exception.MyException;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kunlun on 2017/2/6.
 */
@RestController
public class HelloController {
    @ApiOperation(value = "工程入口类",notes = "访问index接口")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index() throws MyException {
        throw new MyException("入口类发生错误");
    }
}

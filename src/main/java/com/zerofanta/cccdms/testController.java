package com.zerofanta.cccdms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ryusi    on 2021-01-18
 */
@Controller
public class testController {

    @RequestMapping(value ="/test")
    public String test() throws Exception{
        return "/test";
    }
}

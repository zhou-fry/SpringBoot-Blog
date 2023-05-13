package com.cn.zy.zbf.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author Administrator
 * @Date 2023/5/13 22:44
 **/
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
//        int i = 9/0;
        return "index";
    }
}

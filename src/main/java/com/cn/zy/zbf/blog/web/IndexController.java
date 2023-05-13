package com.cn.zy.zbf.blog.web;

import com.cn.zy.zbf.blog.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
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

        String blog = null;
        if(blog == null) {
            throw  new NotFoundException("博客不存在");
        }
        return "index";
    }
}

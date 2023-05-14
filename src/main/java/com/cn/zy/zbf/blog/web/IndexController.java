package com.cn.zy.zbf.blog.web;

import com.cn.zy.zbf.blog.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author Administrator
 * @Date 2023/5/13 22:44
 **/
@Controller
public class IndexController {
    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name) {
//        String blog = null;
//        if(blog == null) {
//            throw  new NotFoundException("博客不存在");
//        }
        System.out.println("--------index--------");
        return "index";
    }
}

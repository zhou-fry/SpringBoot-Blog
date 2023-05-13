package com.cn.zy.zbf.blog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ClassName NotFoundException
 * @Description TODO
 * @Author Administrator
 * @Date 2023/5/14 0:09
 **/

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException  extends RuntimeException{
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


}

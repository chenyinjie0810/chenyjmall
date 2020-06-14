package com.chenyj.basecommon.handler;

import com.chenyj.commonutils.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2020/6/14 0014
 * 陈银杰专属测试
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result error(Exception e){
        e.printStackTrace();
        return Result.error().message(e.getMessage());
    }

}

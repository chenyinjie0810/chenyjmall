package com.chenyj.basecommon.handler;

import com.chenyj.basecommon.exception.ChenyjException;
import com.chenyj.commonutils.Result;
import com.chenyj.commonutils.utils.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2020/6/14 0014
 * 陈银杰专属测试
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result error(Exception e){
        log.error(e.getMessage());
        e.printStackTrace();
        return Result.error().message(e.getMessage());
    }

    /**
     * @desc: 自定义异常
     * @author: chenyj
     * @date:  2020/6/14 0014
     * @param e
     * @return
     */
    @ExceptionHandler(ChenyjException.class)
    public Result error(ChenyjException e) {
        log.error(ExceptionUtil.getMessage(e));
        
        e.printStackTrace();
        return Result.error().code(e.getCode()).message(e.getMsg());
    }

}

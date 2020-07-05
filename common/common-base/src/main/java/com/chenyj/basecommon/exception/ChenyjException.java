package com.chenyj.basecommon.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2020/6/14 0014
 * 陈银杰专属测试
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChenyjException extends RuntimeException {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String msg;
}

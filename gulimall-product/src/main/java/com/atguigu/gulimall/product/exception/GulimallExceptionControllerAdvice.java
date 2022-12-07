package com.atguigu.gulimall.product.exception;

import com.atguigu.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lucky
 * @date 2022/9/29 12:12
 * 集中处理所有异常
 */
//@ResponseBody//以json字符串形式返回
@Slf4j
/*@ControllerAdvice(basePackages = "com.atguigu.gulimall.product.controller")*/
@RestControllerAdvice(basePackages = "com.atguigu.gulimall.product.controller")
public class GulimallExceptionControllerAdvice{


    @ExceptionHandler(value = Exception.class)
    public R handleVaildException(Exception e){
        log.error("数据校验出现问题{},异常类型:{}",e.getMessage(),getClass());
        return R.error();
    }

}

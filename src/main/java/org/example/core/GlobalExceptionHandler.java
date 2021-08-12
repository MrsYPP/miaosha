package org.example.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Mrs Yang
 * @date 2021/7/20 21:43
 */
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);



    /**
     * 处理自定义异常
     *
     */
    @ExceptionHandler(value = BizException.class)
    public Result bizExceptionHandler(BizException e) {
        log.error(e.getMessage(), e);
        return new Result().failure(e.getMsg());
    }

    /**
     *处理其他异常
     *
     */
    @ExceptionHandler(value = Exception.class)
    public Result exceptionHandler( Exception e) {
        log.error(e.getMessage(), e);
        return new Result().failure(e.getMessage());

    }

}

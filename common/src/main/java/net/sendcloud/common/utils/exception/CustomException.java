package net.sendcloud.common.utils.exception;

import lombok.Data;

/**
 * @author tangzs
 * @date 2020/8/6
 * @description
 */

@Data
public class CustomException extends RuntimeException{
    //异常错误编码
    private int code ;
    //异常信息
    private String message;

    private CustomException(){}

    public CustomException(CustomExceptionType exceptionTypeEnum,
                           String message) {
        this.code = exceptionTypeEnum.getCode();
        this.message = message;
    }
}

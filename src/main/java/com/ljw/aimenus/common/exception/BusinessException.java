package com.ljw.aimenus.common.exception;

import lombok.Getter;

/**
 * 业务异常类
 * 用于业务逻辑中抛出的可预期异常
 *
 * @author liujiawei
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final Integer code;

    /**
     * 构造业务异常，默认错误码500
     *
     * @param message 错误信息
     */
    public BusinessException(String message) {
        super(message);
        this.code = 500;
    }

    /**
     * 构造业务异常
     *
     * @param code    错误码
     * @param message 错误信息
     */
    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * 构造业务异常，带原因
     *
     * @param code    错误码
     * @param message 错误信息
     * @param cause   异常原因
     */
    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
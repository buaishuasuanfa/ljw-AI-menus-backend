package com.ljw.aimenus.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一响应包装类
 * 所有接口返回数据都使用此类包装
 *
 * @param <T> 数据类型
 * @author liujiawei
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 返回成功结果（无数据）
     *
     * @return 成功结果
     */
    public static <T> Result<T> success() {
        return new Result<>(200, "success", null);
    }

    /**
     * 返回成功结果（带数据）
     *
     * @param data 数据
     * @return 成功结果
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }

    /**
     * 返回成功结果（带消息和数据）
     *
     * @param message 消息
     * @param data    数据
     * @return 成功结果
     */
    public static <T> Result<T> success(String message, T data) {
        return new Result<>(200, message, data);
    }

    /**
     * 返回错误结果（默认500错误码）
     *
     * @param message 错误信息
     * @return 错误结果
     */
    public static <T> Result<T> error(String message) {
        return new Result<>(500, message, null);
    }

    /**
     * 返回错误结果
     *
     * @param code    错误码
     * @param message 错误信息
     * @return 错误结果
     */
    public static <T> Result<T> error(Integer code, String message) {
        return new Result<>(code, message, null);
    }

    /**
     * 返回错误结果（带数据）
     *
     * @param code    错误码
     * @param message 错误信息
     * @param data    数据
     * @return 错误结果
     */
    public static <T> Result<T> error(Integer code, String message, T data) {
        return new Result<>(code, message, data);
    }
}
package com.ljw.aimenus.common.exception;

/**
 * 资源未找到异常
 * 用于查询资源不存在时抛出
 *
 * @author liujiawei
 */
public class NotFoundException extends BusinessException {

    /**
     * 构造资源未找到异常
     *
     * @param message 错误信息
     */
    public NotFoundException(String message) {
        super(404, message);
    }

    /**
     * 构造资源未找到异常，带资源名和ID
     *
     * @param resource 资源名称
     * @param id       资源ID
     */
    public NotFoundException(String resource, Object id) {
        super(404, String.format("%s not found with id: %s", resource, id));
    }
}
package com.ljw.aimenus.common.request;

import lombok.Data;

/**
 * 分页请求基类
 * 用于分页查询接口接收参数
 *
 * @author liujiawei
 */
@Data
public class PageRequest {

    /**
     * 当前页码，默认第1页
     */
    private Integer pageNum = 1;

    /**
     * 每页大小，默认10条
     */
    private Integer pageSize = 10;

    /**
     * 排序字段
     */
    private String orderBy;

    /**
     * 是否升序，默认升序
     */
    private Boolean asc = true;

    /**
     * 计算偏移量（用于SQL LIMIT语句）
     *
     * @return 偏移量
     */
    public Integer getOffset() {
        return (pageNum - 1) * pageSize;
    }
}
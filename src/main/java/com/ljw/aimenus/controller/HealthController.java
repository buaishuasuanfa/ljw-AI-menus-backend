package com.ljw.aimenus.controller;

import com.ljw.aimenus.common.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 健康检查控制器
 * 提供服务状态检查接口
 *
 * @author liujiawei
 */
@RestController
@RequestMapping
public class HealthController {

    /**
     * 健康检查接口
     * 用于检测服务是否正常运行
     *
     * @return 服务状态信息
     */
    @GetMapping("/health")
    public Result<Map<String, String>> health() {
        return Result.success(Map.of(
            "status", "UP",
            "service", "AI Menus"
        ));
    }
}
package com.leyou.gateway.fallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务熔断降级处理类
 */
@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public String fallback(){
        return "服务器繁忙，请稍后再试...";
    }

}

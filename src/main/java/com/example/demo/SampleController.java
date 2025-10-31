package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    private static final Logger log = LoggerFactory.getLogger(SampleController.class);

    // シンプルなサンプルエンドポイント
    // 例: GET http://localhost:8080/api/hello -> "Hello, World!"
    @GetMapping("/hello")
    public String hello() {
        log.info("/api/hello endpoint called");
        return "Hello, World!";
    }
}

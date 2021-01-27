package com.project.meat.chatbot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"swagger test"}, value = "swagger 정상 작동을 확인하기 위한 테스트 API")
@RestController
@RequiredArgsConstructor
public class SwaggerTestController {

    @GetMapping(value = "/swagger-test")
    @ApiOperation(value = "Swagger Test API", notes = "swagger 작동을 확인하기 위한 단순 텍스트 반환 API")
    public String helloWorld() {
        return "hello world";
    }

}

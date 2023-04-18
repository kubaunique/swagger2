/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.springbootswaggerspringfox.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hayricicek
 */
@RestController
@Api("This is The Hello Swagger API Documentation")
public class HelloSwaggerController {
    
    @GetMapping("/hello-swagger")
    @ApiOperation("Return String hello swagger")
    public String helloSwagger() {
        return "hello swagger";
    }
    
    @PostMapping("/post-hello")
    @ApiOperation("This is the POST request")
    public String postReq() {
        return "post";
    }
}

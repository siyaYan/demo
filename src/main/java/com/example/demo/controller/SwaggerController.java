package com.example.demo.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 
* @Params: swagger
* @Author: Siya(Xiran) Yan 
* @Date: 11:25 1/12/20
*/
@Api(value="api")
@RestController
public class SwaggerController {
    @ApiOperation(value="JAVA Spring boot info",notes = "name description for it")
    @ApiImplicitParam(name="name",value="name for it",required=true,dataType="String",paramType="path")
    @ApiResponses(value = {
            @ApiResponse(code=200,message = "Successful!"),
            @ApiResponse(code=404,message = "can't find the doc!"),
            @ApiResponse(code=500,message = "Server has error!")
    })
    @GetMapping("getName/{name}")
    public  String getName(@PathVariable(value = "name") String name) {
        return "testName"+name+"????";
    }
    @ApiOperation(value="JAVA Spring boot info",notes = "id description for it")
    @ApiImplicitParam(name="id",value="id for it",required=true,dataType="String",paramType="path")
    @ApiResponses(value = {
            @ApiResponse(code=200,message = "Successful!"),
            @ApiResponse(code=404,message = "can't find the doc!"),
            @ApiResponse(code=500,message = "Server has error!")
    })
    @PostMapping("getId/{id}")
    public  String getId(@PathVariable(value = "id") String id) {
        return "getId"+id+"????";
    }
}
package com.example.demo.controller;

public class SwaggerController {
}
/**
 * @Api(value = "hello")
 * @RestController public class HelloWorldController {
 * @ApiOperation(value = "获取公众号详细描述信息", notes = "根据公众号名称获取详细描述信息")
 * @ApiImplicitParam(name = "name", value = "公众号名称", required = true, dataType = "String", paramType = "path")
 * @ApiResponses(value = {
 * @ApiResponse(code = 200, message = "Successful — 请求已完成"),
 * @ApiResponse(code = 400, message = "请求语法问题或无法满足请求"),
 * @ApiResponse(code = 401, message = "Unauthorized，未授权访问"),
 * @ApiResponse(code = 404, message = "服务器找不到资源；文件不存在"),
 * @ApiResponse(code = 500, message = "服务器不能完成请求")}
 * )
 * @GetMapping("getName/{name}") public String getName(@PathVariable(value = "name") String name) {
 * return "关注微信公众号“" +name+ "”(w_z90110)，" +
 * "Spring Boot系列文章持续更新中，" +
 * "带你从入门到精通，玩转Spring Boot框架。";
 * }
 * @ApiOperation(value = "获取公众号详细描述信息", notes = "根据公众号编号获取详细描述信息")
 * @ApiImplicitParam(name = "id", value = "公众号编号", required = true, dataType = "String", paramType = "path")
 * @ApiResponses(value = {
 * @ApiResponse(code = 200, message = "Successful — 请求已完成"),
 * @ApiResponse(code = 400, message = "请求语法问题或无法满足请求"),
 * @ApiResponse(code = 401, message = "Unauthorized，未授权访问"),
 * @ApiResponse(code = 404, message = "服务器找不到资源；文件不存在"),
 * @ApiResponse(code = 500, message = "服务器不能完成请求")}
 * )
 * @PostMapping("getId/{id}") public String getId(@PathVariable(value = "id") String id) {
 * return "关注微信公众号“Java精选”(" +id+ ")，" +
 * "Spring Boot系列文章持续更新中，" +
 * "带你从入门到精通，玩转Spring Boot框架。";
 * }
 * }
 **/
package com.example.demo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.PathDecorator;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
* 
* @Params: swagger
* @Author:Siya(Xiran) Yan
* @Date:10:47
*/

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private ApiInfo apiinfo() {
        return new ApiInfoBuilder().title("API-document").description("java spring boot framework")
                .version("1.0.0").build();
    }
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiinfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                .paths(PathSelectors.any()).build();
    }
}

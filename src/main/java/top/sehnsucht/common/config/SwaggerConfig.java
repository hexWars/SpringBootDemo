package top.sehnsucht.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.schema.AlternateTypeRules.newRule;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/13
 * ~~(^_^)~~
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("全局")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.sehnsucht.common"))
                .build()
                ;
    }

    @Bean
    public Docket docket1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("用户")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.sehnsucht.user"))
                .build()
                ;
    }

    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("员工")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.sehnsucht.emp"))
                .build()
                ;
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("cwww", "https://blog.csdn.net/Dueser?spm=1000.2115.3001.5343", "999999999");
        return new ApiInfo("管理系统"
                , "一个小小的示例"
                , "1.0"
                , "https://blog.csdn.net/Dueser?spm=1000.2115.3001.5343"
                , contact
                , "Apache 2.0"
                , "http://www.apache.org/licenses/LICENSE-2.0"
                , new ArrayList()
        );
    }
}

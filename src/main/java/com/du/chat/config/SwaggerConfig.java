package com.du.chat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/11/12 23:17
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * <p>
     *     swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
     * </p>
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.du.chat.controller"))
                .paths(PathSelectors.any()).build();
    }

    /**
     * <p>
     *     构建 api文档的信息
     * </p>
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 设置页面标题
                .title("标题")
                // 设置联系人
                .contact(new Contact("name", "url", "email"))
                // 描述
                .description("文档描述信息")
                // 定义版本号
                .version("1.0").build();
    }
}

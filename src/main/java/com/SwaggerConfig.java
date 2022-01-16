package com;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Win-System Api")
                                .version("1.0.0")
                                .contact(
                                        new Contact()
                                                .email("yuriy.vins@gmail.com")
                                                .url("https://win-system.com")
                                                .name("Yuriy Vins")
                                )
                );
    }

}

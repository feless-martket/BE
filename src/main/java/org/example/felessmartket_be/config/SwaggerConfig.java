package org.example.felessmartket_be.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    //http://localhost:8080/swagger-ui/index.html
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .components(new Components())
            .info(info());
    }

    private Info info() {
        return new Info()
            .title("FelessMarket")
            .description("ASAC-06 team project / Market-Kurly Clone Project")
            .version("1.0");
    }
}
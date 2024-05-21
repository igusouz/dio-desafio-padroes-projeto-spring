package igor.souza.gof.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Padrões de Projeto")
                        .version("1.0")
                        .description("Documentação da API de Padrões de Projeto em Spring Boot")
                        .contact(new Contact()
                                .name("Ígor Souza")
                                .url("https://www.linkedin.com/in/igusouz/")
                                .email("igorrafael.jobs@gmail.com")));
    }
}

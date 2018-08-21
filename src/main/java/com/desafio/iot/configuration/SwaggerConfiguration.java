package com.desafio.iot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {


    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("DesafioIot")
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .build();
    }
    
    private ApiInfo apiInfo() {
    	Contact contact = new Contact("Gustavo Polar","","");
    	
        return new ApiInfoBuilder()
                .title("EndPoint rest para a Crud de ações do carrinho iot")
                .description("serviços para consultar ações do carrinho iot")
                .contact(contact)
                .license("Versão 1.0")
                .version("2.0")
                .build();
    }
	
}

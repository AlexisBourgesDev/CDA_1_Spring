package fr.alexisbourges.cefimtestcda2.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
public class SpringFoxConfig {
    @Bean
    public GroupedOpenApi publicApi(){
        return GroupedOpenApi.builder()
                .group("springshop-public")
                .packagesToScan("fr.alexisbourges.cefimtestcda2")
                .build();
    }
}
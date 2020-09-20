package net.idt.learning;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class Config {
    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("raven.where")
    RavenListener ravenListener() {
        return new RavenListener();
    }
}

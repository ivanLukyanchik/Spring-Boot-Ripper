package net.idt.learning.spring_boot_ripper.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    @VanyaComponent
    public String str1() {
        return "String1";
    }

    @Bean
    public String str2() {
        return "String2";
    }

    @Bean
    @VanyaComponent
    public String str3() {
        return "String3";
    }
}

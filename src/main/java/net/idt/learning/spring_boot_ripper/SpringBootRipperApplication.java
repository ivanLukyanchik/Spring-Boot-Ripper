package net.idt.learning.spring_boot_ripper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootRipperApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootRipperApplication.class, args);
        System.out.println("beanDefinitionCount = " + run.getBeanDefinitionCount());
    }

}

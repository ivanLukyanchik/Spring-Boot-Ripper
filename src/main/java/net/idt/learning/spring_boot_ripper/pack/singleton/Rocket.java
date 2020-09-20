package net.idt.learning.spring_boot_ripper.pack.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class Rocket {

    @PostConstruct
    public void init() {
        System.out.println("Rocket initialized");
    }

    public void beatByRocket() {
        System.out.println("Beat by rocket");
    }
}

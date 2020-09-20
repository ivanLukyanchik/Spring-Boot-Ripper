package net.idt.learning.spring_boot_ripper.pack.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Arny {
    @Autowired
    @Lazy
    private Rocket rocket;

    @EventListener(ContextRefreshedEvent.class)
    public void start() {
        if (isEnemyLess100()) {
            beatByLog();
        } else {
            rocket.beatByRocket();
        }
    }

    private void beatByLog() {
        System.out.println("Beat by log!");
    }

    private boolean isEnemyLess100() {
        return true;
    }
}

package net.idt.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
            ravenProperties.getWhere().forEach(s ->
                System.out.println("Отправляем ворона... в " +  s));
    }
}

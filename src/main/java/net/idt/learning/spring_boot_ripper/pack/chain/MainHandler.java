package net.idt.learning.spring_boot_ripper.pack.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MainHandler {
    @Autowired
    List<CommonInterface> handlers;

    @PostConstruct
    public void print() {
        System.out.println("--------------------------------------------------------");
        handlers.stream().map(CommonInterface::handle).forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
    }
}

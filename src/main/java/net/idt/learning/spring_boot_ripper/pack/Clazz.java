package net.idt.learning.spring_boot_ripper.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Clazz {
    @Autowired
    @VanyaComponent
    private List<String> list;

    @PostConstruct
    public void init() {
        System.out.println("*************************************");
        System.out.println(list.toString());
        System.out.println("*************************************");
    }
}

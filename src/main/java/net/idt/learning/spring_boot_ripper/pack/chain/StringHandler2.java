package net.idt.learning.spring_boot_ripper.pack.chain;

import org.springframework.stereotype.Component;

@Component
public class StringHandler2 implements CommonInterface {
    @Override
    public String handle() {
        return "From here ";
    }
}

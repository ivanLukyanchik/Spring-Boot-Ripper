package net.idt.learning.spring_boot_ripper.pack.strategy;

import org.springframework.stereotype.Service;

@Service
public class ViberSender implements MessageSender {
    @Override
    public String send() {
        return "Message sent via viber";
    }

    @Override
    public String getCode() {
        return "001";
    }
}

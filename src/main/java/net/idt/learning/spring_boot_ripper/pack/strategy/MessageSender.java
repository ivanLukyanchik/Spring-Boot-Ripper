package net.idt.learning.spring_boot_ripper.pack.strategy;

import org.springframework.beans.factory.annotation.Autowired;

public interface MessageSender {

    @Autowired
    default void regMe(MainSenderController mainSender) {
        mainSender.register(getCode(), this);
    }

    String send();
    String getCode();
}

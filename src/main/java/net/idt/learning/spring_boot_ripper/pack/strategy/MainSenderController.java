package net.idt.learning.spring_boot_ripper.pack.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

@RestController
public class MainSenderController {
    private Map<String, MessageSender> map = new HashMap<>();

    public void register(String code, MessageSender sender) {
        map.put(code, sender);
    }

    /*
    @Autowired
    public MainSenderController(List<MessageSender> senders) {
        map = senders.stream().collect(toMap(MessageSender::getCode, messageSender -> messageSender));
    }*/

    @PostMapping("/send")
    public String send(@RequestBody Message message) {
        String code = message.getCode();
        MessageSender messageSender = map.get(code);
        return messageSender.send();
    }
}

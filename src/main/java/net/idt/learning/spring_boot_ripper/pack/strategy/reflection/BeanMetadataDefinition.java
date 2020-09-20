package net.idt.learning.spring_boot_ripper.pack.strategy.reflection;

import lombok.Data;

@Data
public class BeanMetadataDefinition {
    private String beanName;
    private String beanClassName;
}

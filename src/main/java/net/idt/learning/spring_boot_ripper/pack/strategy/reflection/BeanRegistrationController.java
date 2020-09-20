package net.idt.learning.spring_boot_ripper.pack.strategy.reflection;

import lombok.SneakyThrows;
import net.idt.learning.spring_boot_ripper.pack.strategy.reflection.BeanMetadataDefinition;
import net.idt.learning.spring_boot_ripper.pack.strategy.reflection.CustomClassLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanRegistrationController {
    @Autowired
    private GenericApplicationContext context;
    @Autowired
    private CustomClassLoader customClassLoader;

    @PostMapping("/registerBean")
    @SneakyThrows
    public String register(@RequestBody BeanMetadataDefinition beanMetadataDefinition) {
        Class<?> loadedClass = customClassLoader.findClass(beanMetadataDefinition.getBeanClassName());
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getBeanFactory();//check why casting needed
        GenericBeanDefinition myBeanDefinition = new GenericBeanDefinition();
        myBeanDefinition.setBeanClass(loadedClass);
        myBeanDefinition.setScope("singleton");
        registry.registerBeanDefinition(beanMetadataDefinition.getBeanName(), myBeanDefinition);
        return "registered " + context.getBean(beanMetadataDefinition.getBeanName());
    }
}

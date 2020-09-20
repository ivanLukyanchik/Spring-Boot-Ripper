package net.idt.learning.spring_boot_ripper.pack.strategy.reflection;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CustomClassLoader extends ClassLoader {

    @Override
    @SneakyThrows
    protected Class<?> findClass(String className) {
        String filename = "target/classes/" + className.replace(".", "/") + ".class";
        System.out.println(filename);
        byte[] b = Files.newInputStream(Path.of(filename)).readAllBytes();
        return defineClass(className, b, 0, b.length);
    }
}

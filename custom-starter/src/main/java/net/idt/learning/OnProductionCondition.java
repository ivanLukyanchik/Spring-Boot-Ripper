package net.idt.learning;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

public class OnProductionCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return JOptionPane.showConfirmDialog(null, "Это продакшн?") == 0;
    }
}

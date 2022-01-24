package com.supremepole.f04springbeanconditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author CodeCoderCoding
 */
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context,
                           AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name")
                .contains("Linux");
    }
}

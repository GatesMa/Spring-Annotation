package com.gatesma.condition;

/**
 * Copyright (C), 2020
 * FileName: WindowsCondition
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/26 16:58
 * Description:
 */
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

//判断是否windows系统
public class WindowsCondition implements Condition{

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        if(property.contains("Windows")) {
            return true;
        }

        return false;
    }
}

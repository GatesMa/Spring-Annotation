package com.gatesma.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import javax.persistence.criteria.Join;
import java.util.Arrays;

/**
 * Copyright (C), 2020
 * FileName: LogAspects
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/30 13:11
 * Description:
 */
@Aspect
public class LogAspects {


    //抽取公共的切入点表达式
    //1、本类引用
    //2、其他的切面引用
    @Pointcut("execution(public int com.gatesma.aop.MathCalculator.*(..))")
    public void pointCut(){};

    //@Before在目标方法之前切入；切入点表达式（指定在哪个方法切入）
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName() + "除法开始：参数：" + Arrays.asList(args));
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {

        System.out.println(joinPoint.getSignature().getName() + "除法结束。");
    }

    //JoinPoint一定要出现在参数表的第一位
    @AfterReturning(value = "pointCut()", returning = "res")
    public void logReturn(JoinPoint joinPoint, Object res) {
        System.out.println(joinPoint.getSignature().getName() + "除法返回。运行结果{" + res + "}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void logException(JoinPoint joinPoint, Exception e) {
        System.out.println(joinPoint.getSignature().getName() + "除法异常。异常信息：{" + e.toString() + "}");
    }

}

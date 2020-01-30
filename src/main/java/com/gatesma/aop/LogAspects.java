package com.gatesma.aop;

import org.aspectj.lang.annotation.*;

/**
 * Copyright (C), 2020
 * FileName: LogAspects
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/30 13:11
 * Description:
 */
public class LogAspects {


    //抽取公共的切入点表达式
    //1、本类引用
    //2、其他的切面引用
    @Pointcut("execution(public int com.gatesma.aop.MathCalculator.*(..))")
    public void pointCut(){};

    //@Before在目标方法之前切入；切入点表达式（指定在哪个方法切入）
    @Before("pointCut()")
    public void logStart() {
        System.out.println("除法开始：");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("除法结束。");
    }

    @AfterReturning("pointCut()")
    public void logReturn() {
        System.out.println("除法返回。运行结果{}");
    }

    @AfterThrowing("pointCut()")
    public void logException() {
        System.out.println("除法异常。异常信息：{}");
    }

}

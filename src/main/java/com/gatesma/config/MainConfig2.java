package com.gatesma.config;

import com.gatesma.bean.Color;
import com.gatesma.bean.Person;
import com.gatesma.bean.Red;
import com.gatesma.condition.LinuxCondition;
import com.gatesma.condition.MyImportBeanDefinitionRegistrar;
import com.gatesma.condition.MyImportSelector;
import com.gatesma.condition.WindowsCondition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * Copyright (C), 2020
 * FileName: MainConfig2
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/26 12:28
 * Description:
 */
//@Condition也可以加在类上面
//@Conditional(LinuxCondition.class)
@SuppressWarnings("ALL")
@Configuration
//@Import导入组件，id默认是组件的全类名
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {


    //默认单实例的
    //Scope注解标识bean的作用域
    /**
     * ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST  request
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION	 sesssion
     * @return
     * @Scope:调整作用域
     * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。
     * 					每次获取的时候才会调用方法创建对象；
     * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
     * 			以后每次获取就是直接从容器（map.get()）中拿，
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     *
     */
    /**
     * 懒加载：
     * 		针对单实例bean（Prototype类型默认懒加载）：默认在容器启动的时候创建对象；
     * 		懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
     * @return
     */
    @Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person() {
//        System.out.println("添加Person对象");
        return new Person("zhangsan", 19);
    }

    /**
     * @Conditional({Condition}) ： 按照一定的条件进行判断，满足条件给容器中注册bean
     *
     * 如果系统是windows，给容器中注册("bill")
     * 如果是linux系统，给容器中注册("linus")
     */

    @Conditional(WindowsCondition.class)
    @Bean("bill")
    public Person person01(){
        return new Person("Bill Gates",62);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linus")
    public Person person02(){
        return new Person("linus", 48);
    }


    /**
     * 导入Bean的四种方式：
     * 1）包扫描+组件标注注解：@Controller、@Service...
     * 2）@Bean导入第三方包里的组件
     * 3）@Import【快速给容器中导入一个组件】
     *      1）、@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
     *      2）、ImportSelector:返回需要导入的组件的全类名数组；
     * 		3）、ImportBeanDefinitionRegistrar:手动注册bean到容器中
     * 4）使用Spring提供的 FactoryBean（工厂Bean）;
     * 		1）、默认获取到的是工厂bean调用getObject创建的对象
     * 		2）、要获取工厂Bean本身，我们需要给id前面加一个&
     * 			&colorFactoryBean
     */






}

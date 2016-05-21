package com.test;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTests {
    @Inject
    private HelloService helloService;


    @Test
    public void testSayHello() {
        Assert.assertEquals("Hello world!", helloService.sayHello());
        System.out.println(helloService.sayHello());
    }
}

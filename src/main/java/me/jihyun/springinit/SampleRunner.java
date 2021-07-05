package me.jihyun.springinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    JihyunProperties jihyunProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("====================");
        System.out.println(jihyunProperties.getName());
        System.out.println(jihyunProperties.getAge());
        System.out.println(jihyunProperties.getSessionTimeout());
        System.out.println("====================");
    }
}

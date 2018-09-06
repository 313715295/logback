package com.zwq.logback;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackApplication {


    public static void main(String[] args) {
        ApplicationContextUtil.run(LogbackApplication.class,args);
    }
}

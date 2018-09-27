package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author 张明亮
 * @date 2018/9/26 11:34
 */
//@EnableAutoConfiguration（exclude = {DataSourceAutoConfiguration.class}）不使用某个自动配置
    //@ImportResource()导入xml配置
@SpringBootApplication//@Configuration，@EnableAutoConfiguration和@ComponentScan

@Import({ MyConfig.class, MyAnotherConfig.class })//导入其他配置类
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

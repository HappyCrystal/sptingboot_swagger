package com.yc;
//123456

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //托管类  ->构造->存到spring容器
@SpringBootApplication
@Configuration    //当前类是一个配置类     查看@ComponentScan  若没有则理解成spring容器扫描  main所在的包及子包 即com.yc及子包  ->@Controller

public class Hello{
	
	public Hello(){
		System.out.println("a");
	}

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
    	System.out.println("abc");
        return "spring boot, hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Hello.class, args);
    }

}


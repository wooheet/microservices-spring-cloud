package com.thoughtmechanix.simpleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication // 스프링 부트 프레임워크에 이 클래스가 스프링 부트 서비스의 진입점
@RestController // 스프링 부트에 이 클래스의 코드를 스프링 RestController클래스로 노출하도록 지정
@RequestMapping(value="hello") // 애플리케이션에서 노출된 url
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(value="/{firstName}/{lastName}",method = RequestMethod.GET)
    public String hello( @PathVariable("firstName") String firstName,
                         @PathVariable("lastName") String lastName) {

        return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
    }
}

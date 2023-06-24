package com.basic.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // json을 반환하는 컨트롤러를 만들어주며, @ResponseBody를 메소드마다 선언한 것을 한 번에 사용할 수 있게 함
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

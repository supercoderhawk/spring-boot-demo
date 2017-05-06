package com.supercoderhawk.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xyb-C308 on 2017/5/3.
 */
@RestController
@SpringBootApplication
public class Application {
  @RequestMapping("/")
  public String index() {
    return "Hello,world";
  }
  public static void main(String[] args) throws Exception {
    SpringApplication.run(Application.class, args);

  }
}

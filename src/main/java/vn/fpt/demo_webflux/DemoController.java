package vn.fpt.demo_webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/")
    public String helloWorld() {
        return "Hello, World!";
    }
//      @GetMapping(value = "/demo")
//    public String demo() {
//        return "Hello, World2!";
//    }
//      @GetMapping(value = "/demo2")
//    public String demo2() {
//        return "Hello, World2!";
//    }
}

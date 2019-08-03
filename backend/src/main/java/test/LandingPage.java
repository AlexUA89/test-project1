package test;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingPage {

    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }

}

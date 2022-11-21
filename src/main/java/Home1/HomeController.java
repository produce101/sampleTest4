package Home1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }


    @RequestMapping("/test1")
    public String test1() {
        System.out.println("테스트~~~");
        return "test1";
    }
}
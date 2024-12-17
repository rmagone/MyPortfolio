package lv.myportfolio.portfoli.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about_me")
    public String aboutMe() {
        return "aboutMe";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "portfolio";
    }

}

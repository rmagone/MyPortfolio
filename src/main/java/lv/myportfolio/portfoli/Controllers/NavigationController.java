package lv.myportfolio.portfoli.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("currentPage","home");
        return "index";
    }

    @GetMapping("/about_me")
    public String aboutMe(Model model) {
        model.addAttribute("currentPage","about");
        return "aboutMe";
    }

    @GetMapping("/portfolio")
    public String portfolio(Model model) {
        model.addAttribute("currentPage","portfolio");
        return "portfolio";
    }

}

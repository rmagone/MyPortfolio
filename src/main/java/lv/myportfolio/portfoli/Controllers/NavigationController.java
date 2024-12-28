package lv.myportfolio.portfoli.Controllers;

import lv.myportfolio.portfoli.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
    @Autowired
    private CardService cardService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("articles", cardService.getAllArticles());
        model.addAttribute("currentPage", "home");
        return "index";
    }

    @GetMapping("/about_me")
    public String aboutMe(Model model) {
        model.addAttribute("currentPage", "about");
        return "aboutMe";
    }

    @GetMapping("/portfolio")
    public String portfolio(Model model) {
        model.addAttribute("currentPage", "portfolio");
        return "portfolio";
    }

}

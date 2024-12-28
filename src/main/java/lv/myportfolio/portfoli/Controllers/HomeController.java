package lv.myportfolio.portfoli.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/processFormVersionTwo")
    public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
        if (theName != null) {
            theName = theName.toUpperCase();
            String result = "Yo! " + theName;
            model.addAttribute("message", result);
        } else {
            model.addAttribute("message", "No student name provided");
        }
        return "processFormV2";
    }
}

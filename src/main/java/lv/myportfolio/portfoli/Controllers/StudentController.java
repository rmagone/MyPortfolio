package lv.myportfolio.portfoli.Controllers;

import lv.myportfolio.portfoli.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {

        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);

        theModel.addAttribute("countries",countries);
        theModel.addAttribute("languages",languages);

        return "student-form";
    }
//which action will be looked for in the form and or end of the link /processStudentForm
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        System.out.println("Student: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        //which form will be called
        return "student-confirmation";
    }
}

package pl.javastart.validationtask;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("data", new RegisterFormDto());
        return "home";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("data") RegisterFormDto registerFormDto,
                           BindingResult bindingResult,
                           Model model) {
        model.addAttribute("formData", registerFormDto);
        return bindingResult.hasErrors() ? "home" : "success";
    }

    @GetMapping("/regulations")
    String showRegulations() {
        return "regulations";
    }
}

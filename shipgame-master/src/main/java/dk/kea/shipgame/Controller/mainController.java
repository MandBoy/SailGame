package dk.kea.shipgame.Controller;
import dk.kea.shipgame.Model.MyImage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class mainController {
    private List<MyImage> images = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("images", images);
        return "Ship-placement";
    }
}


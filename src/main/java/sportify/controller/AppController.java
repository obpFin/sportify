package sportify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import sportify.model.Sports;
import sportify.model.Workout;

import java.time.LocalDate;

/**
 * Created by admin on 04/01/17.
 */
@Controller
public class AppController {

    @RequestMapping({"/", "index"})
    public String homepage() {


        return "index";
    }

    @RequestMapping("/login")
    public String login() {


        return "login";
    }


}

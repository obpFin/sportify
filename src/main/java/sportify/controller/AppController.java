package sportify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 04/01/17.
 */
@Controller
public class AppController {

    @RequestMapping("/")
    public String homepage() {


        return "index";
    }

    @RequestMapping("/login")
    public String login() {


        return "login";
    }
}
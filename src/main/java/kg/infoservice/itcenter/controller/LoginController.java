package kg.infoservice.itcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String getLoginPage(){
        return "login";
    }
}

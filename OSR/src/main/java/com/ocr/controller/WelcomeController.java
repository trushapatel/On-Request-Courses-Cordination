package com.ocr.controller;

import com.ocr.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Map;

/**
 * Created by Ankit on 03-02-2017.
 */
@Controller
@RequestMapping("/home")
public class WelcomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(Map<String,Object> model){

        return "home";
    }

}

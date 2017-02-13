package com.ocr.controller;

import com.ocr.domain.Employee;
import com.ocr.repository.EmployeeRepository;
import com.ocr.service.EmployeeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Ankit on 11-02-2017.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }


    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, HttpSession session, ModelMap model){
        String email = request.getParameter("username");
        String password = request.getParameter("password");

        if (StringUtils.isBlank(email) || StringUtils.isBlank(password)){
            model.put("errorMessage","Username or password invalid.");
            return "login";
        }

        // Retrieve employee details
        Employee employee = employeeService.findByEmail(email);
        if(employee == null || !password.equals(employee.getPassword())){
            model.put("errorMessage","Username or password invalid.");
            return "login";
        }
        session.setAttribute("currentUser",employee);
        model.put("employee",employee);

        return "redirect:/home/";
    }

}

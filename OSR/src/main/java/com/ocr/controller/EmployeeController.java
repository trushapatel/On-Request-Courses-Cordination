package com.ocr.controller;

import com.ocr.domain.Department;
import com.ocr.domain.Employee;
import com.ocr.service.DepartmentService;
import com.ocr.service.EmployeeService;
import com.ocr.domain.Address;
import com.ocr.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by Ankit on 07-02-2017.
 */
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private AddressService addressService;
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String create(Map<String,Object> model){
        List<Department> departments = departmentService.getList();
        model.put("departments",departments);
        model.put("employee",new Employee());
        return "employee/create";
    }

    @RequestMapping(value = "/show/{id}",method = RequestMethod.GET)
    public String show(@PathVariable("id") Integer id,Map<String,Object> model){
        Employee employee = employeeService.get(id);
        model.put("employee",employee);
        return "employee/create";
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable("id") Integer id,Map<String,Object> model){
        List<Department> departments = departmentService.getList();
        model.put("departments",departments);
        Employee employee = employeeService.get(id);
        model.put("employee",employee);
        return "employee/edit";
    }

    @RequestMapping(value = "/save")
    public String save(@Valid @ModelAttribute("employee") Employee employee, BindingResult result, Map<String,Object> model){
        if(result.hasErrors()){
            return "employee/create";
        }
        if(employee.getId() == null){
            employee.setPassword("Admin@123");
        }
        employeeService.save(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView list(Map<String,Object> model){
        List<Employee> employees = employeeService.getList();
        model.put("employees",employees);
        return new ModelAndView("employee/list");
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id") Integer id){
        Employee employee = employeeService.get(id);
        employeeService.delete(employee);
        return "redirect:/employees/list";
    }

}

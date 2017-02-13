package com.ocr.controller;

import com.ocr.domain.Department;
import com.ocr.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by Ankit on 07-02-2017.
 */
@Controller
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String create(Map<String,Object> model){
        model.put("department",new Department());
        return "department/create";
    }

    @RequestMapping(value = "/show/{id}",method = RequestMethod.GET)
    public String show(@PathVariable("id") Integer id,Map<String,Object> model){
        Department department = departmentService.get(id);
        model.put("department",department);
        return "department/create";
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable("id") Integer id,Map<String,Object> model){
        Department department = departmentService.get(id);
        model.put("department",department);
        return "department/edit";
    }

    @RequestMapping(value = "/save")
    public String save(@Valid @ModelAttribute("department") Department department, BindingResult result, Map<String,Object> model){
        if(result.hasErrors()){
            return "create";
        }
        departmentService.save(department);
        return "redirect:list";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView list(Map<String,Object> model){
        List<Department> departments = departmentService.getList();
        model.put("departments",departments);
        return new ModelAndView("department/list");
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id") Integer id){
        Department department = departmentService.get(id);
        departmentService.delete(department);
        return "redirect:/departments/list";
    }

}

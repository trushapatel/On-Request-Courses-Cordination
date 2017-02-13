package com.ocr.controller;

import com.ocr.domain.Course;
import com.ocr.service.CourseService;
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
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String create(Map<String,Object> model){
        model.put("course",new Course());
        return "course/create";
    }

    @RequestMapping(value = "/show/{id}",method = RequestMethod.GET)
    public String show(@PathVariable("id") Integer id,Map<String,Object> model){
        Course course = courseService.get(id);
        model.put("course",course);
        return "course/create";
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable("id") Integer id,Map<String,Object> model){
        Course course = courseService.get(id);
        model.put("course",course);
        return "course/edit";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@Valid @ModelAttribute("course") Course course, BindingResult result, Map<String,Object> model){
        if(result.hasErrors()){
            return "create";
        }
        courseService.save(course);

        return "redirect:list";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView list(Map<String,Object> model){
        List<Course> courses = courseService.getList();
        model.put("courses",courses);
        return new ModelAndView("course/list");
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id") Integer id){
        Course course = courseService.get(id);
        courseService.delete(course);
        return "redirect:/courses/list";
    }

}

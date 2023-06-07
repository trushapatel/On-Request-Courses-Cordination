package com.ocr.service;

import com.ocr.domain.Course;

import java.util.List;


public interface CourseService {
    public void save(Course t);
    public Course get(Integer id);
    public List<Course> getList();
    public void delete(Course t);
}

package com.ocr.service;

import com.ocr.domain.Course;

import java.util.List;

/**
 * Created by Ankit on 28-01-2017.
 */
public interface CourseService {
    public void save(Course t);
    public Course get(Integer id);
    public List<Course> getList();
    public void delete(Course t);
}

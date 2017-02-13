package com.ocr.repository;

import com.ocr.domain.Course;

import java.util.List;

/**
 * Created by Ankit on 28-01-2017.
 */
public interface CourseRepository {

    public void save(Course t);
    public List<Course> getList();
    public Course get(Integer id);
    public void delete(Course t);
}

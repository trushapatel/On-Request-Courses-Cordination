package com.ocr.service;

import com.ocr.domain.Course;
import com.ocr.repository.CourseRepository;
import com.ocr.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankit on 28-01-2017.
 */
@Service("CourseService")
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public List<Course> getList(){
        return courseRepository.getList();
    }

    @Override
    public Course get(Integer id) {
        return courseRepository.get(id);
    }

    @Override
    public void delete(Course course) {
        courseRepository.delete(course);
    }
}

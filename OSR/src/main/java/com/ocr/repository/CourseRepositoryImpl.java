package com.ocr.repository;

import com.ocr.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankit on 28-01-2017.
 */
@Repository("courseRepositoryImpl")
public class CourseRepositoryImpl implements CourseRepository{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Course course) {
        hibernateTemplate.saveOrUpdate(course);
    }

    @Override
    public List<Course> getList(){
        return hibernateTemplate.loadAll(Course.class);
    }

    @Override
    public Course get(Integer id) {
        return hibernateTemplate.get(Course.class,id);
    }

    @Override
    public void delete(Course course) {
        hibernateTemplate.delete(course);
    }
}

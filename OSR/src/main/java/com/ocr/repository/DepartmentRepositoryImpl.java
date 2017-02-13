package com.ocr.repository;

import com.ocr.domain.Department;
import com.ocr.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankit on 28-01-2017.
 */
@Repository("departmentRepositoryImpl")
public class DepartmentRepositoryImpl implements  DepartmentRepository{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Department department) {
        hibernateTemplate.saveOrUpdate(department);
    }

    @Override
    public List<Department> getList(){
        List<Department> data=new ArrayList<Department>();
        data=hibernateTemplate.loadAll(Department.class);
        return data;
    }


    @Override
    public Department get(Integer id) {
        return hibernateTemplate.get(Department.class,id);
    }

    @Override
    public void delete(Department department) {
        hibernateTemplate.delete(department);
    }
}

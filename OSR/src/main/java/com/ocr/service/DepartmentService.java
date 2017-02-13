package com.ocr.service;

import com.ocr.domain.Department;

import java.util.List;

/**
 * Created by Ankit on 28-01-2017.
 */
public interface DepartmentService {

    public void save(Department t);
    public Department get(Integer id);
    public void delete(Department t);
    public List<Department> getList();
}

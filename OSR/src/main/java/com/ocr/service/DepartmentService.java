package com.ocr.service;

import com.ocr.domain.Department;

import java.util.List;


public interface DepartmentService {

    public void save(Department t);
    public Department get(Integer id);
    public void delete(Department t);
    public List<Department> getList();
}

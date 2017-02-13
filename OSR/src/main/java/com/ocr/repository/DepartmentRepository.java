package com.ocr.repository;

import com.ocr.domain.Department;

import java.util.List;

/**
 * Created by Ankit on 28-01-2017.
 */
public interface DepartmentRepository {
    public void save(Department t);
    public List<Department> getList();

    public Department get(Integer id);
    public void delete(Department t);
}


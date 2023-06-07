package com.ocr.service;

import com.ocr.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public void save(Employee t);
    public Employee get(Integer id);
    public List<Employee> getList();
    public void delete(Employee t);
    public Employee findByEmail(String email);
}

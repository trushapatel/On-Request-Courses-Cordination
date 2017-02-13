package com.ocr.repository;
import com.ocr.domain.Employee;

import java.util.List;

/**
 * Created by Ankit on 28-01-2017.
 */
public interface EmployeeRepository {

    public void save(Employee t);
    public List<Employee> getList();
    public Employee get(Integer id);
    public void delete(Employee t);
    public Employee findByEmail(String email);

}

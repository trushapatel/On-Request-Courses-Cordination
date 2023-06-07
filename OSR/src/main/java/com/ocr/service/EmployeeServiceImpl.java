package com.ocr.service;

import com.ocr.domain.Employee;
import com.ocr.repository.AddressRepository;
import com.ocr.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service("EmployeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);

    }
    @Override
    public List<Employee> getList()
    {
        List<Employee> data=new ArrayList<Employee>();
        data= employeeRepository.getList();
        return data;
    }

    @Override
    public Employee get(Integer id) {
        return employeeRepository.get(id);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Employee findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

}

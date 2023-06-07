package com.ocr.service;

import com.ocr.domain.Department;
import com.ocr.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service("DepartmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getList(){
        List<Department> data=new ArrayList<Department>();
        data= departmentRepository.getList();
        return data;
    }
    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public Department get(Integer id) {
        return departmentRepository.get(id);
    }

    @Override
    public void delete(Department department) {
        departmentRepository.delete(department);
    }


}

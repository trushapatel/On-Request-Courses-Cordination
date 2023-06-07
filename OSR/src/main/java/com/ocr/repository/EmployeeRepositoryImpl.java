package com.ocr.repository;

import com.ocr.domain.Employee;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;


@Repository("employeeRepositoryImpl")
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Employee employee) {
        hibernateTemplate.saveOrUpdate(employee);
    }

    @Override
    public List<Employee> getList(){
        List<Employee> data=new ArrayList<Employee>();
        data=hibernateTemplate.loadAll(Employee.class);
        return data;
    }
    @Override
    public Employee get(Integer id) {
        return hibernateTemplate.get(Employee.class,id);

    }

    @Override
    public void delete(Employee employee) {
        hibernateTemplate.delete(employee);
    }

    /*@Override
    public Employee findByEmail(String email) {
        Criteria criteria = hibernateTemplate.getSessionFactory().getCurrentSession().createCriteria(Employee.class);
        criteria.add(Restrictions.eq("email",email));

        List<Employee> employees = (List<Employee>) criteria.list();

        if(employees != null && employees.isEmpty()){
            return employees.get(0);
        }
        return null;
    }*/

    @Override
    public Employee findByEmail(String email) {
        List<Employee> employees = (List<Employee>)  hibernateTemplate.findByNamedParam("select employee from Employee employee where employee.email=:email","email",email);
        if(employees != null && !employees.isEmpty()){
            return employees.get(0);
        }
        return null;
    }
}

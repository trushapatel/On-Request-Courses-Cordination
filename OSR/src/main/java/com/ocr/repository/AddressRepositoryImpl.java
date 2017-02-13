package com.ocr.repository;

import com.ocr.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("addressRepository")
public class AddressRepositoryImpl implements AddressRepository {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Address address) {
        hibernateTemplate.saveOrUpdate(address);
    }

    @Override
    public List<Address> getList(){
        List<Address> data=new ArrayList<Address>();
        data=hibernateTemplate.loadAll(Address.class);
        return data;
    }

    @Override
    public Address get(Integer id) {
        return hibernateTemplate.get(Address.class,id);
    }

    @Override
    public void delete(Address address) {
        hibernateTemplate.delete(address);
    }
}

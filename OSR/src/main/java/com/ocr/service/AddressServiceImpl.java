package com.ocr.service;

import com.ocr.domain.Address;
import com.ocr.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("AddressService")
@Transactional
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void save(Address address) {
        addressRepository.save(address);

    }

    @Override
    public List<Address> getList(){
        List<Address> data=new ArrayList<Address>();
        data= addressRepository.getList();
        return data;
    }

    @Override
    public Address get(Integer id) {
        return addressRepository.get(id);
    }

    @Override
    public void delete(Address address) {
        addressRepository.delete(address);
    }
}

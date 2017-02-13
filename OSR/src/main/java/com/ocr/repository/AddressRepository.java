package com.ocr.repository;

import com.ocr.domain.Address;

import java.util.List;


public interface AddressRepository {

    public void save(Address t);
    public List<Address> getList();
    public Address get(Integer id);
    public void delete(Address t);

}

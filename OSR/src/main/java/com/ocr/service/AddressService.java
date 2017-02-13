package com.ocr.service;

import com.ocr.domain.Address;

import java.util.List;

/**
 * Created by Ankit on 28-01-2017.
 */
public interface AddressService {

    public void save(Address t);
    public Address get(Integer id);
    public List<Address> getList();
    public void delete(Address t);
}

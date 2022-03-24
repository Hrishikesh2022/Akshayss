package com.csi.dao;

import com.csi.model.Customer;

import java.util.List;

public interface CustomerDao {

    public void saveData(Customer customer);
    public List<Customer> getAllData();
    public void updateData(int custId, Customer customer);
    public void deleteData(int custId);
}

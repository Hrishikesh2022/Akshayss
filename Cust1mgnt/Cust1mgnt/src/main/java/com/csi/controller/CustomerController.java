package com.csi.controller;

import com.csi.model.Customer;
import com.csi.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerServiceImpl;

    @GetMapping("/getData")
    public List<Customer> getAllData() {
        return customerServiceImpl.getAllData();
    }

    @PostMapping("/saveData")
    public String saveData(@RequestBody Customer customer) {
        customerServiceImpl.saveData(customer);
        return " Customer Data Saved Successfully";

    }


    @PutMapping("/updateData/{customerId}")
    public String updateData(@PathVariable int customerId, @RequestBody Customer customer) {
        customerServiceImpl.updateData(customerId, customer);
        return " Customer Data Updated Successfully";
    }

    @DeleteMapping("/deleteData/{customerId}")
    public String deleteData(@PathVariable int customerId) {
        customerServiceImpl.deleteData(customerId);
        return "Customer Data Deleted Successfully";
    }
    @GetMapping("/myname")
    public String myName(){
        return "Hrishi";
    }

}

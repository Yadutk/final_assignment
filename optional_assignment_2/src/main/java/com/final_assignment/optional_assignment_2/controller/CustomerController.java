package com.final_assignment.optional_assignment_2.controller;

import com.final_assignment.optional_assignment_2.model.Customer;
import com.final_assignment.optional_assignment_2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/getCustomer/{customer_id}")
    public Customer getCustomer(@PathVariable String customer_id){
        return customerService.getCustomer(customer_id);
    }

    @RequestMapping("/deleteCustomer/{customer_id}")
    public String deleteCustomer(@PathVariable String customer_id){
        return customerService.deleteCustomer(customer_id);
    }
    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.addCustomer(customer);
        return ResponseEntity.ok(createdCustomer);

    }
    @PostMapping("/alterCustomer")
    public ResponseEntity<Customer> alterCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.alterCustomer(customer);
        return ResponseEntity.ok(createdCustomer);

    }
}

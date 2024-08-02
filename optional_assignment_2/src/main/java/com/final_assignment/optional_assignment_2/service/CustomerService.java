package com.final_assignment.optional_assignment_2.service;

import com.final_assignment.optional_assignment_2.model.Customer;
import com.final_assignment.optional_assignment_2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService{

    @Autowired
    public CustomerRepository customerRepository;

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }
    public Customer getCustomer(String customer_id) {
        return customerRepository.findById(customer_id).orElse(null);
    }

    public Customer alterCustomer(Customer customer) {
        return customerRepository.save(customer);    }


    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public String deleteCustomer(String customer_id) {
        Optional<Customer> customer = customerRepository.findById(customer_id);
        if (customer.isPresent()) {
            customerRepository.delete(customer.get());
            return "Customer deleted successfully";
        } else {
            return "Customer not found";
        }
    }
}

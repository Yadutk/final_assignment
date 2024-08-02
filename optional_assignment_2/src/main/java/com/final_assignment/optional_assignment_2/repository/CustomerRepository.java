package com.final_assignment.optional_assignment_2.repository;

import com.final_assignment.optional_assignment_2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {

}

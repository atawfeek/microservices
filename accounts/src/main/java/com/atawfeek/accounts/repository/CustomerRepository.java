package com.atawfeek.accounts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atawfeek.accounts.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> { //JPA: Java Persistence API

    // encapsulate all CRUD operations behind the scenes by extending the JPA repository

    
    // by help of spring data JPA framework - we use naming convention in abstract method.
    Optional<Customer> findByMobileNumber(String mobileNumber);

    /*
     * Optional is used where the fn might return a customer or not.
     */
}

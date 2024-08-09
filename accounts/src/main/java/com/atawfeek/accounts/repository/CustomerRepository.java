package com.atawfeek.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atawfeek.accounts.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> { //JPA: Java Persistence API

    // encapsulate all CRUD operations behind the scenes by extending the JPA repository
}

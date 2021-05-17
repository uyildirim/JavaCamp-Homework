package com.example.springwebdemo01.dataAccess;

import com.example.springwebdemo01.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Long> {
}

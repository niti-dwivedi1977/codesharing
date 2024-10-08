package com.wipro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.CustomerLogin;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerLogin,Long>{

}

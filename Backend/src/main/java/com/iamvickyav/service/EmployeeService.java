package com.iamvickyav.service;

import com.iamvickyav.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService extends JpaRepository<Employee, Integer>{

}

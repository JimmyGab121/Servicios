package com.loxasoft.employeeservice.repository;

import com.loxasoft.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employee, Integer> {
}

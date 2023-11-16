package com.loxasoft.departmentservice.repository;

import com.loxasoft.departmentservice.entity.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentRepository extends JpaRepository<Departament, Integer> {
}

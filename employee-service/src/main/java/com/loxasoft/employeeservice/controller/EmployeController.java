package com.loxasoft.employeeservice.controller;

import com.loxasoft.employeeservice.dto.ResponseDTO;
import com.loxasoft.employeeservice.entity.Employee;
import com.loxasoft.employeeservice.service.EmployeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employes")
@AllArgsConstructor
public class EmployeController {

    private final EmployeService employeService;

    @PostMapping
    public Employee saveEmploye(@RequestBody Employee employee){
        return employeService.saveEmploye(employee);
    }

    @GetMapping
    public ResponseDTO getEmployedById(@PathVariable Integer id){

        return employeService.getEmployeById(id);
    }
}

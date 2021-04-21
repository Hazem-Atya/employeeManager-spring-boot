package org.hazem.employeemanager.service;

import lombok.extern.slf4j.Slf4j;
import org.hazem.employeemanager.Model.Employee;
import org.hazem.employeemanager.exception.UserNotFoundException;
import org.hazem.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


import java.util.UUID;


@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Mono<Employee> addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        System.out.println("hello there");
        return employeeRepo.save(employee);
    }

    public Flux<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Mono<Employee> updateCustomer(@RequestBody Employee employee, @PathVariable Integer id) {
        return employeeRepo.save(employee);
    }

    public Mono<Void> deleteEmployee(Long id) {
        return employeeRepo.deleteById(id);
    }

    public Mono<Employee> findById(Long id) {
        return employeeRepo.findById(id);
    }

}

package org.hazem.employeemanager.service;

import lombok.extern.slf4j.Slf4j;
import org.hazem.employeemanager.Model.Employee;
import org.hazem.employeemanager.exception.UserNotFoundException;
import org.hazem.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


import java.util.UUID;

/*
@Slf4j
*/
@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

/*    public Mono<Employee> addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }*/

    public Flux<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Mono<Employee> updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
/*
    public Mono<Employee> findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by Id " + id + " was not found"));
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

    public Mono<Employee> deleteUser(Long id) {
        return employeeRepo.findById(id)
                .flatMap(existingEmployee -> employeeRepo.delete(existingEmployee)
                        .then(Mono.just(existingEmployee)));
    }*/
}

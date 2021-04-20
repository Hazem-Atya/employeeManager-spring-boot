package org.hazem.employeemanager.repo;

import org.hazem.employeemanager.Model.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface EmployeeRepo extends ReactiveCrudRepository<Employee,Long> {


/*
    public void deleteEmployeeById(Long id);
*/

   public Optional<Mono<Employee>> findEmployeeById(Long id);
}

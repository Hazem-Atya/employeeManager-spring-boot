package org.hazem.employeemanager.repo;

import org.hazem.employeemanager.Model.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface EmployeeRepo extends ReactiveCrudRepository<Employee, Long> {



/*   @Transactional
   public Optional<Mono<Employee>> findEmployeeById(Long id);*/
}

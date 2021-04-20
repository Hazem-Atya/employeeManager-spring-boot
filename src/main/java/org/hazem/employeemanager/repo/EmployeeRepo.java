package org.hazem.employeemanager.repo;

import org.hazem.employeemanager.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository <Employee,Long> {


/*
    public void deleteEmployeeById(Long id);
*/

   public Optional<Employee> findEmployeeById(Long id);
}

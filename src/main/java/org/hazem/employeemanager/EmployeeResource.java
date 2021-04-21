package org.hazem.employeemanager;


import org.hazem.employeemanager.Model.Employee;
import org.hazem.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

  //  @CrossOrigin
    @GetMapping("/all")

    public ResponseEntity<Flux<Employee>> getAllEmployee() {
        Flux<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
 //   @CrossOrigin

  @GetMapping("/find/{id}")
    public ResponseEntity<Mono<Employee>> getEmployeeById(@PathVariable("id") Long id) {
        Mono<Employee> employee = employeeService.findById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
  //  @CrossOrigin

    @PostMapping("/add")
    public  ResponseEntity< Mono<Employee>> addEmployee(@RequestBody Employee employee) {
        Mono<Employee> newEmployee = employeeService.addEmployee(employee);

        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
  //  @CrossOrigin

    @PutMapping("/update")
    public ResponseEntity<Mono<Employee>> updateEmployee(@RequestBody Employee employee) {
        Mono<Employee> updateEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }


    //@Transactional
   // @CrossOrigin("http://localhost:41200")

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Mono<Void>>  deleteEmployee(@PathVariable("id") Long id) {
       Mono<Void> res= employeeService.deleteEmployee(id);
        return new ResponseEntity<Mono<Void>>(res,HttpStatus.OK);

    }

}

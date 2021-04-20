package org.hazem.employeemanager.Model;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

/*@Entity*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("employee")
public class Employee implements Serializable {
    @Id
    private long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
/*
    @Column(nullable = false, updatable = false)
*/
    private String employeeCode;

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setEmployeeCode("hah");
    }


}

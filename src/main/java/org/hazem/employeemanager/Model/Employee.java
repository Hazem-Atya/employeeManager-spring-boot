package org.hazem.employeemanager.Model;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

/*@Entity*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table/*("employee")*/
public class Employee implements Serializable {
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String jobTitle;
    @Column
    private String phone;
    @Column
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

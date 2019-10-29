package com.kodilla.hibernate.manytomany.facade.api;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "EmployeeDto.searchEmployeeWithGivenLetter",
        query = "SELECT * FROM EMPLOYEE WHERE LASTNAME LIKE CONCAT('%', :LASTNAME, '%')",
        resultClass = EmployeeDto.class
)

@Entity
@Table(name = "EMPLOYEES")
public class EmployeeDto {
    private int id;
    private String firstName;
    private String lastName;
    private List<CompanyDto> companiesList = new ArrayList<>();

    public EmployeeDto() {
    }

    public EmployeeDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "FIRSTNAME")
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "LASTNAME")
    public String getLastName() {
        return lastName;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_COMPANY_EMPLOYEE",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "ID")}
    )
    public List<CompanyDto> getCompaniesList() {
        return companiesList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompaniesList(List<CompanyDto> companiesList) {
        this.companiesList = companiesList;
    }
}

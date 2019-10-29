package com.kodilla.hibernate.manytomany.facade.api;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "CompanyDto.searchCompanyWithGivenLetter",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT('%', :COMPANYNAME, '%')",
        resultClass = CompanyDto.class
)

@Entity
@Table(name = "COMPANIES")
public class CompanyDto {
    private int id;
    private String companyName;
    private List<EmployeeDto> employeesList = new ArrayList<>();

    public CompanyDto() {
    }

    public CompanyDto(String companyName) {
        this.companyName = companyName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "COMPANY_NAME")
    public String getCompanyName() {
        return companyName;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<EmployeeDto> getEmployeesList() {
        return employeesList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployeesList(List<EmployeeDto> employeesList) {
        this.employeesList = employeesList;
    }
}

package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDto {
    @Autowired
    private int id;
    private String firstName;
    @Autowired
    private String lastName;
    @Autowired
    private List<Company> companies = new ArrayList<>();
}

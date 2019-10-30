package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.dao.CompanyDtoDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDtoDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchFacade {

    @Autowired
    private CompanyDtoDao companyDtoDao;

    @Autowired
    private EmployeeDtoDao employeeDtoDao;

    public List<CompanyDto> searchCompanyWithGivenLetter(String letters) {
        return companyDtoDao.searchCompanyWithGivenLetter(letters);
    }

    public List<EmployeeDto> searchEmployeeWithGivenLetter(String letters) {
        return employeeDtoDao.searchEmployeeWithGivenLetter(letters);
    }
}

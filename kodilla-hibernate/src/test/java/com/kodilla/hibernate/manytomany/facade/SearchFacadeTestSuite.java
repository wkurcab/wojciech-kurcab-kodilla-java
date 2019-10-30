package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDtoDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDtoDao;
import com.kodilla.hibernate.manytomany.facade.api.CompanyDto;
import com.kodilla.hibernate.manytomany.facade.api.EmployeeDto;
import com.kodilla.hibernate.manytomany.facade.api.SearchFacade;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    private CompanyDtoDao companyDtoDao;

    @Autowired
    private EmployeeDtoDao employeeDtoDao;

    @Autowired
    private SearchFacade searchFacade;

    @Test
    public void testSearchCompanyAndEmployee() {
        //Given
        CompanyDto company1 = new CompanyDto("Apple");
        CompanyDto company2 = new CompanyDto("Microsoft");
        CompanyDto company3 = new CompanyDto("IBM");

        EmployeeDto employee1 = new EmployeeDto("Jessie", "Pinkman");
        EmployeeDto employee2 = new EmployeeDto("Walter", "White");
        EmployeeDto employee3 = new EmployeeDto("Ivone", "Escobar");
        EmployeeDto employee4 = new EmployeeDto("John", "Smith");

        company1.getEmployeesList().add(employee1);
        company2.getEmployeesList().add(employee2);
        company3.getEmployeesList().add(employee3);
        company1.getEmployeesList().add(employee4);

        employee1.getCompaniesList().add(company1);
        employee2.getCompaniesList().add(company2);
        employee3.getCompaniesList().add(company3);
        employee4.getCompaniesList().add(company1);

        companyDtoDao.save(company1);
        int company1Id = company1.getId();
        companyDtoDao.save(company2);
        int company2Id = company2.getId();
        companyDtoDao.save(company3);
        int company3Id = company3.getId();

        //When
        List<CompanyDto> searchCompany = searchFacade.searchCompanyWithGivenLetter("ros");
        List<EmployeeDto> searchEmployee = searchFacade.searchEmployeeWithGivenLetter("esc");

        //Then
        assertEquals(1, searchCompany.size());
        assertEquals(1, searchEmployee.size());

        //Clean Up
        companyDtoDao.deleteById(company1Id);
        companyDtoDao.deleteById(company2Id);
        companyDtoDao.deleteById(company3Id);
    }
}

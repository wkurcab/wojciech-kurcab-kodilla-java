package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDtoDao;
import com.kodilla.hibernate.manytomany.facade.api.CompanyDto;
import com.kodilla.hibernate.manytomany.facade.api.EmployeeDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    private CompanyDtoDao companyDtoDao;

    @Test
    public void testSearchCompany() {
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
        companyDtoDao.save(company2);
        companyDtoDao.save(company3);

        //When
        List<CompanyDto> searchCompany = companyDtoDao.searchCompanyWithGivenLetter("ros");

        //Then
        assertEquals(1, searchCompany.size());
    }
}

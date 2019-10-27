//package com.kodilla.hibernate.manytomany.facade;
//
//import com.kodilla.hibernate.manytomany.Company;
//import com.kodilla.hibernate.manytomany.dao.CompanyDao;
//import com.kodilla.hibernate.manytomany.facade.api.CompanyDto;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SearchFacadeTestSuite {
//    @Autowired
//    private CompanyDao companyDao;
//
//    @Test
//    public void testSearchCompany() {
//        //Given
//        Company company1 = new Company("Apple");
//        Company company2 = new Company("Microsoft");
//        Company company3 = new Company("IBM");
//        Company company4 = new Company("Google");
//        Company company5 = new Company("Amazon");
//        Company company6 = new Company("Intel");
//
//        companyDao.save(company1);
//        companyDao.save(company2);
//        companyDao.save(company3);
//        companyDao.save(company4);
//        companyDao.save(company5);
//        companyDao.save(company6);
//
//        //When
////        List<CompanyDto> searchCompany = companyDtoDao.searchCompanyWithGivenCharacter("ros");
//
//        //Then
////        assertEquals(1, searchCompany.size());
//    }
//}

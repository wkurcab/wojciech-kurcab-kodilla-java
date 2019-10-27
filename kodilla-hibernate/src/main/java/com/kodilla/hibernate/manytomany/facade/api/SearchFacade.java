//package com.kodilla.hibernate.manytomany.facade.api;
//
//import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class SearchFacade {
//    @Autowired
//    private CompanyDtoDao companyDtoDao;
//    @Autowired
//    private EmployeeDao employeeDao;
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
//
//    public List<CompanyDto> searchCompanyWithGivenCharacter(String letters) {
//        return companyDtoDao.searchCompanyWithGivenCharacter(letters);
//    }
//}

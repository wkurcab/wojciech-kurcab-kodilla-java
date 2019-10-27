//package com.kodilla.hibernate.manytomany.facade.api;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.NamedNativeQuery;
//import javax.persistence.Table;
//
//@NamedNativeQuery(
//        name = "CompanyDto.searchCompanyWithGivenCharacter",
//        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE % :COMPANYNAME %",
//        resultClass = CompanyDto.class
//)
//
//@Entity
//@Table(name = "COMPANIES")
//public class CompanyDto {
//    private final String companyName;
//
//    public CompanyDto(String companyName) {
//        this.companyName = companyName;
//    }
//
//    @Column(name = "COMPANY_NAME")
//    public String getCompanyName() {
//        return companyName;
//    }
//}

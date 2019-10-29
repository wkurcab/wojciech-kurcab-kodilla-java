package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.facade.api.CompanyDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface CompanyDtoDao extends CrudRepository<CompanyDto, Integer> {
    @Query(nativeQuery = true)
    List<CompanyDto> searchCompanyWithGivenLetter(@Param("COMPANYNAME") String companyName);
}

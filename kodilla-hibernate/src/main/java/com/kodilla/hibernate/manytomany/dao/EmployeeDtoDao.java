package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.facade.api.EmployeeDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDtoDao extends CrudRepository<EmployeeDto, Integer> {
    @Query(nativeQuery = true)
    List<EmployeeDto> searchEmployeeWithGivenLetter(@Param("LASTNAME") String lastName);
}

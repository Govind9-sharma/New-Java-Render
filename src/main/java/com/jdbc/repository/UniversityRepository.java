package com.jdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc.entity.University;

public interface UniversityRepository extends JpaRepository<University,String>{

}

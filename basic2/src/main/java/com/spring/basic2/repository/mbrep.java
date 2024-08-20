package com.spring.basic2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.basic2.model.mybook;

@Repository
public interface mbrep extends JpaRepository<mybook, Integer> {

}

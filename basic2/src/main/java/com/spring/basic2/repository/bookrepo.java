package com.spring.basic2.repository;





import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.spring.basic2.model.book;


@Repository
public interface bookrepo extends JpaRepository<book, Integer>{



}

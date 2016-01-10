package com.eceris.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eceris.store.domain.Form;

@Repository
public interface FormRepository extends JpaRepository<Form, Long> {

}

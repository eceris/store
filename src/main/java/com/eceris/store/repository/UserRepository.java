package com.eceris.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eceris.store.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

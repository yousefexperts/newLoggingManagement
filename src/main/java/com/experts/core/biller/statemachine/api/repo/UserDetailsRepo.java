package com.experts.core.biller.statemachine.api.repo;


import com.experts.core.biller.statemachine.api.model.domain.jpa.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDetailsRepo extends JpaRepository<Users, Long> {
    Users findByUserName(String userName);
}

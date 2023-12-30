package com.codewithme.BackendApplication.repository;

import com.codewithme.BackendApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

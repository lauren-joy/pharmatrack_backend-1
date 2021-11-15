package com.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.models.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	
}
package com.ty.clubspark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.clubspark.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findUserByEmail(String email);

	User findUserByPhone(long phone);

	User findUserByRole(String role);

}

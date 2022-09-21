package com.ty.clubspark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.clubspark.dto.Membership;

public interface MembershipRepository extends JpaRepository<Membership, Integer>{
	
	@Query(value = "SELECT m FROM Membership m WHERE m.email= ")
	Membership findMembershipByEmail(String email);

}

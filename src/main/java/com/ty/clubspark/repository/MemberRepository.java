package com.ty.clubspark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.clubspark.dto.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

	Member findMemberByEmail(String email);

	Member findMemberByPhone(long phone);
}

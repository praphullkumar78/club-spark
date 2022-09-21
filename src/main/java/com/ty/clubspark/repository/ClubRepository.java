package com.ty.clubspark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.clubspark.dto.Club;

public interface ClubRepository extends JpaRepository<Club, Integer>{
	
	Club findByRanking(int ranking);
	
	Club findByLeader(String leader);

}

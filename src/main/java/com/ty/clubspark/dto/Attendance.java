package com.ty.clubspark.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Attendance {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;

	@CreationTimestamp
	private LocalDateTime entry;
	@CreationTimestamp
	private LocalDateTime exit;
	@CreationTimestamp
	private LocalDate day;

	@OneToOne
	private Member member;
	
	@OneToOne
	private User user;

}

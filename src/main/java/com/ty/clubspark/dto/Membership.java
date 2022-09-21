package com.ty.clubspark.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Membership {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	private LocalDate dateOfPurchase;
	@NotNull
	private LocalDate dateOfExpiry;
	@OneToOne
	private Package membershipPackage;
	@OneToOne
	@JoinColumn
	private Member member;
	@JsonIgnore
	@OneToOne(mappedBy = "membership")
	private Payment payment;

}

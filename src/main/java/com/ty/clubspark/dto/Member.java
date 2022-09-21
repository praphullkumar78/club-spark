package com.ty.clubspark.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Member {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;

	private String name;
	@Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message = "Proper Email Required")
    @NotBlank
	private String email;
	private long phone;
	@NotBlank
	private String password;

	@CreationTimestamp
	private LocalDateTime dob;

	private String address;
	
	@OneToOne(mappedBy = "member")
	private Membership membership;

}

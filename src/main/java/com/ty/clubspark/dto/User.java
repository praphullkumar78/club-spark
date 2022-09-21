package com.ty.clubspark.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Please Enter Your Name")
	private String name;
	@Column(unique = true, nullable = false)
	@Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message = "Proper Email Required")
	@NotBlank
	private String email;
	@NotBlank(message = "*password required")
	private String password;
	@Column(unique = true, nullable = false)
	@NotNull(message = "phone number is required")
	private long phone;
	@CreationTimestamp
	private LocalDate dob;
	@NotBlank(message = "Please enter your address")
    private String address;
	@NotBlank
	private String role;
}

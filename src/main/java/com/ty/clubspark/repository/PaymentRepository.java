package com.ty.clubspark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.clubspark.dto.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}

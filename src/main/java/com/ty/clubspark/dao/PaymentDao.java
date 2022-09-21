package com.ty.clubspark.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.clubspark.dto.Payment;
import com.ty.clubspark.repository.PaymentRepository;

@Repository
public class PaymentDao {
	@Autowired
	private PaymentRepository paymentRepository;

	public Payment savePayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	public Payment getPaymentById(int id) {
		Optional<Payment> payment = paymentRepository.findById(id);
		if (payment.isPresent()) {
			return payment.get();
		} else {
			return null;
		}
	}

	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	
	}

	public Payment updatePayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	public boolean cancelPayment(int id) {
		Optional<Payment> payment = paymentRepository.findById(id);
		if (payment.isPresent()) {
			paymentRepository.delete(payment.get());
			return true;
		} else {
			return false;
		}
	}

}

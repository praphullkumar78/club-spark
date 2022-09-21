package com.ty.clubspark.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.clubspark.dto.Membership;
import com.ty.clubspark.repository.MembershipRepository;

@Repository
public class MembershipDao {
	@Autowired
	private MembershipRepository membershipRepository;

	public Membership saveMembership(Membership membership) {
		return membershipRepository.save(membership);
	}

	public Membership getMembershipById(int id) {
		Optional<Membership> optional = membershipRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public List<Membership> getAllMemberships() {
		return membershipRepository.findAll();
	}

	public Membership updateMembership(Membership membership) {
		return membershipRepository.save(membership);
	}

	public Membership findMembershipByEmail(String email) {
		Membership membership = membershipRepository.findMembershipByEmail(email);
		if (membership != null) {
			return membership;
		} else {
			return null;
		}
	}

	public boolean deleteMembershipById(int id) {
		Optional<Membership> optional = membershipRepository.findById(id);
		if (optional.isPresent()) {
			membershipRepository.delete(optional.get());
			return true;
		} else {
			return false;
		}
	}

}

package com.ty.clubspark.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.clubspark.dto.Member;
import com.ty.clubspark.repository.MemberRepository;

@Repository
public class MemberDao {

	@Autowired
	private MemberRepository memberRepository;

	public Member saveMember(Member member) {
		return memberRepository.save(member);
	}

	public List<Member> getAllMember() {
		return memberRepository.findAll();
	}

	public Member updateMember(Member member) {
		return memberRepository.save(member);

	}

	public Member findMemberById(int id) {
		Optional<Member> opt = memberRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}

	public boolean deleteMemberById(int id) {
		Optional<Member> opt = memberRepository.findById(id);
		if (opt.isPresent()) {
			memberRepository.delete(opt.get());
			return true;
		} else {
			return false;
		}
	}

	public Member findMemberByEmail(String email) {
		Member member = memberRepository.findMemberByEmail(email);
		if (member != null) {
			return member;
		} else {
			return null;
		}
	}

	public Member findMemberByPhone(long phone) {
		Member member = memberRepository.findMemberByPhone(phone);
		if (member != null) {
			return member;
		} else {
			return null;
		}
	}
}

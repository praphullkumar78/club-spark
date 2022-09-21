package com.ty.clubspark.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.clubspark.dto.User;
import com.ty.clubspark.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User findUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUser() {
		return userRepository.findAll();

	}

	public User findUserByEmail(String email) {
		User user = userRepository.findUserByEmail(email);
		if (user != null) {
			return user;
		} else {
			return null;
		}
	}

	public User findUserByPhone(long phone) {
		User user = userRepository.findUserByPhone(phone);
		if (user != null) {
			return user;
		} else {
			return null;
		}
	}

	public User findUserByRole(String role) {
		User user = userRepository.findUserByRole(role);
		if (user != null) {
			return user;
		} else {
			return null;
		}
	}

	public User validateUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

	public User validateUserByPhone(long phone) {
		return userRepository.findUserByPhone(phone);
	}

	public boolean deleteUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			userRepository.delete(user.get());
			return true;

		} else {
			return false;
		}

	}
}

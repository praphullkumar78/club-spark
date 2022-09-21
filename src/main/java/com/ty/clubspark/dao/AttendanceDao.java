package com.ty.clubspark.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.clubspark.dto.Attendance;
import com.ty.clubspark.repository.AttendanceRepository;

@Repository
public class AttendanceDao {

	@Autowired
	private AttendanceRepository attendanceRepository;

	public Attendance saveAttendance(Attendance attendance) {
		return attendanceRepository.save(attendance);
	}

	public List<Attendance> getAllAttendance() {
		return attendanceRepository.findAll();
	}

	public Attendance getAttendanceById(int id) {
		Optional<Attendance> opt = attendanceRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}

	public Attendance getAttendenceByEmail(String email) {
		Attendance attendance = attendanceRepository.findAttendenceByEmail(email);
		if (attendance != null) {
			return attendance;
		} else {
			return null;
		}
	}

	public Attendance getAttendenceByEntryDate(LocalDateTime entry) {
		Attendance attendance = attendanceRepository.findAttendenceByEntryDate(entry);
		if (attendance != null) {
			return attendance;
		} else {
			return null;
		}
	}
}

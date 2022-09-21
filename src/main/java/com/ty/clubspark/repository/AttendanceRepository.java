package com.ty.clubspark.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.clubspark.dto.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

	Attendance findAttendenceByEntryDate(LocalDateTime entry);

	Attendance findAttendenceByEmail(String email);

}

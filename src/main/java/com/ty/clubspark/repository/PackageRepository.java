package com.ty.clubspark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.clubspark.dto.Package;

public interface PackageRepository extends JpaRepository<Package, Integer> {

}

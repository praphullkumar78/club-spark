package com.ty.clubspark.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.clubspark.dto.Package;
import com.ty.clubspark.repository.PackageRepository;

@Repository
public class PackageDao {
	@Autowired
	private PackageRepository packageRepository;

	public Package savePackage(Package package1) {
		return packageRepository.save(package1);
	}

	public Package getPackageById(int id) {
		Optional<Package> optional = packageRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public List<Package> getAllPackages() {
		return packageRepository.findAll();
	}

	public Package updatePackage(Package package1) {
		return packageRepository.save(package1);
	}

}

package com.mybootapp.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybootapp.main.model.Vendor;
import com.mybootapp.main.repository.VendorRepo;

@Service
public class VendorService {

	@Autowired
	private VendorRepo vendorRepo; 
	
	public Vendor insert(Vendor vendor) {
		 return vendorRepo.save(vendor);
	}

	public Vendor getById(int vendorId) {
		 
		Optional<Vendor> optional = vendorRepo.findById(vendorId);
		if(!optional.isPresent())
			return null;
		return optional.get();
	}

}
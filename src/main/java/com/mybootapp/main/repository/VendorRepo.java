package com.mybootapp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybootapp.main.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer>{

}
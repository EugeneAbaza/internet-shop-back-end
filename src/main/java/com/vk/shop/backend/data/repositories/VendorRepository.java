package com.vk.shop.backend.data.repositories;

import com.vk.shop.backend.data.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long>{
}

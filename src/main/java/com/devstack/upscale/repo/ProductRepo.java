package com.devstack.upscale.repo;

import com.devstack.upscale.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}

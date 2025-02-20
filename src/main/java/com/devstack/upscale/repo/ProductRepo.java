package com.devstack.upscale.repo;

import com.devstack.upscale.entity.Customer;
import com.devstack.upscale.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,String> {
    @Query(value = "SELECT * FROM product WHERE description LIKE %?1% OR qty LIKE %?1% OR unitPrice LIKE %?1% ",nativeQuery = true)
    public Page<Product> findAllWithSearchText(String searchText, Pageable pageable);
    @Query(value = "SELECT COUNT(*) FROM product WHERE description LIKE %?1% OR qty LIKE %?1% OR unitPrice LIKE %?1% ",nativeQuery = true)
    public long countAllWithSearchText(String searchText);
}

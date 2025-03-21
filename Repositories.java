//  Category Repository (CategoryRepository.java)

package com.example.ecommerce.repository;

import com.example.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}


// Product Repository (ProductRepository.java):

package com.example.ecommerce.repository;

import com.example.ecommerce.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAll(Pageable pageable);
}

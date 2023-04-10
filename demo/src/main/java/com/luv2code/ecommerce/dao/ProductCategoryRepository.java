package com.luv2code.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.luv2code.ecommerce.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
@CrossOrigin("http://localhost:4200")

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
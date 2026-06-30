package com.sai.springcore.Questions.q7.Repositories;

import com.sai.springcore.Questions.q7.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products,Long> {


}

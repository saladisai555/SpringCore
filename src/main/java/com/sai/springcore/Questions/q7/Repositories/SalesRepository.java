package com.sai.springcore.Questions.q7.Repositories;

import com.sai.springcore.Questions.q7.Entity.Sales;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesRepository extends JpaRepository<Sales,Long> {
    //a)
    List<Sales> findByProductName(String name);
    //b
    List<Sales> findByQuantityBetween(int min,int max);
    //c
    @Query("Select s from Sales s where s.pricePerUnit<s.product.price")
    List<Sales> findSalesWithLowerPrice();
    //d
    List<Sales> findAllByOrderByQuantityAsc();

    //e
    Page<Sales> findAll(Pageable pageable);

}

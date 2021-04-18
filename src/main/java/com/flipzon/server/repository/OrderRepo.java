package com.flipzon.server.repository;

import com.flipzon.server.model.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo {
    @Query("from Orders o where o.oid=:orid")
    List<Orders> findById(@Param("orid") long oid);

    @Query("from Orders o where o.status=:sts")
    List<Orders> findByStatus(@Param("sts") long status);

}
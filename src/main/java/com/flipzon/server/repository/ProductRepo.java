package com.flipzon.server.repository;

import com.flipzon.server.model.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepo {
    @Query("from Products p where p.name=:pname ")
    List<Products> findByName(@Param("pname") String pname);

    @Query("from Products p where p.pid=:productId")
    List<Products> findById(@Param("productId") long pid);

}

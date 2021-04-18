package com.flipzon.server.repository;

import com.flipzon.server.model.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo {
    @Query("from Address a where a.aid=:adid")
    List<Address> findById(@Param("adid") long aid);

}

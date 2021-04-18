package com.flipzon.server.repository;

import com.flipzon.server.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo {
    @Query("from Users u where u.uid=:usid")
    List<Users> findById(@Param("usid") long uid);

    @Query("from Users u where u.firstName=:fname")
    List<Users> findByFirstName(@Param("fname") String firstName);

    @Query("from Users u where u.lastName=:lname")
    List<Users> findByLastName(@Param("lname") String lastName);

    @Query("from Users u where u.username=:uname")
    List<Users> findByUserName(@Param("uname") String username);

}

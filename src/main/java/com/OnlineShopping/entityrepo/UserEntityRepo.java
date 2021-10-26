package com.OnlineShopping.entityrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnlineShopping.entity.User;


@Repository
public interface UserEntityRepo extends JpaRepository<User, Long> {

}

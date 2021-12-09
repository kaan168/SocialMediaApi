package com.example.InstagramApi.dataAccess.abstracts;


import com.example.InstagramApi.entities.concrents.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO extends JpaRepository<User,Integer> {

}
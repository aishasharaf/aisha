package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.beans.UserBean;

public interface StudentRespository extends JpaRepository<UserBean,Integer> {

}

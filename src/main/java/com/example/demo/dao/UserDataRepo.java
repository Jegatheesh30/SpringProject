package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.example.demo.model.UserData;

public interface UserDataRepo extends JpaRepository<UserData, Integer> {

	UserData findByemail(String string);
	

	
}

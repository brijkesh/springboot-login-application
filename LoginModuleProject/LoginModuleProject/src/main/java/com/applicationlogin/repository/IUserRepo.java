package com.applicationlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.applicationlogin.model.User;

public interface IUserRepo extends JpaRepository<User, Long> {
	
	@Query(value="select * from login_detail where userid =:uid",nativeQuery = true)
	public User getUserDetailById(@Param("uid")Long userId);
	

}

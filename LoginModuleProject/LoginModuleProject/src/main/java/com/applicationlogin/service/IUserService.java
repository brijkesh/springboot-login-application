package com.applicationlogin.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.applicationlogin.model.User;
import com.applicationlogin.response.Response;

public interface IUserService {

	
	public Response getUserDetail(User user);

}

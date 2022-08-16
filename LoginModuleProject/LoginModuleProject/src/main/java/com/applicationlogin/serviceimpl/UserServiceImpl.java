package com.applicationlogin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.applicationlogin.model.User;
import com.applicationlogin.repository.IUserRepo;
import com.applicationlogin.response.Response;
import com.applicationlogin.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	IUserRepo iUserRepo;

	public Response getUserDetail(User user) {

            if(user.getUserId()!=null && user.getPassword()!=null) {
            	
            	
            	User userDetails = iUserRepo.getUserDetailById(user.getUserId());
            	
            	if(userDetails!=null) {
            		
            		if(user.getUserId().equals(userDetails.getUserId()) && user.getPassword().equals(userDetails.getPassword())) {
            			
            		  return Response.response("Login successfully", HttpStatus.OK, userDetails, null);
            		}
            		else {
              		  return Response.response("user id and password incorrect", HttpStatus.OK, user, null);

            			
            		}
            		
            	}
            	else {
            		  return Response.response("user not found", HttpStatus.NOT_FOUND, user, null);
            	}
            	
            }
            
  		  return Response.response("userId and password should not be null", HttpStatus.BAD_REQUEST, null, null);

            	
           
		
		
	}

	

}

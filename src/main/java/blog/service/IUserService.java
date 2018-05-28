package blog.service;

import java.util.List;

import blog.bean.User;


public interface IUserService {

	List<User> selectAllUsers();

	User getUserById(int i);
	
}

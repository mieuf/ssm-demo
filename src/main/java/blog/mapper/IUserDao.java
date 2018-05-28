package blog.mapper;

import java.util.List;

import blog.bean.User;

public interface IUserDao {

	List<User> selectAllUsers();
	
	User selectUserById();
}

package blog.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import blog.bean.User;
import blog.mapper.IUserDao;

@Service("userService")
public class UserServiceImpl implements IUserService {  
   
	@Resource
    private IUserDao userMapper;  
    
	@Override
	public List<User> selectAllUsers() {
		userMapper.selectAllUsers();
		return null;
	}

	@Override
	public User getUserById(int i) {
		userMapper.selectUserById();
		return null;
	}
	
}
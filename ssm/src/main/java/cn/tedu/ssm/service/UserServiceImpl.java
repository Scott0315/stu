package cn.tedu.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.ssm.mapper.UserMapper;
import cn.tedu.ssm.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	private UserMapper userMapper;
	public List<User> findAll(){
		return userMapper.findAll();
		 
	}
	
	public User get(Integer id) {
		return userMapper.get(id);
	}

	public void update(User user) {
		userMapper.update(user);
		
	}
	public void add(User user) {
		userMapper.add(user);
	}
	
	public void delete(Integer id) {
		userMapper.delete(id);
	}

}

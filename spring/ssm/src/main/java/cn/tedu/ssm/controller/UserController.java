package cn.tedu.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.ssm.pojo.User;
import cn.tedu.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired 
	private UserService userService;
	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<User> findAll(){
		return userService.findAll();
		
	}
	
	@RequestMapping("/get/{id}")
	@ResponseBody
	public User get(@PathVariable("id")Integer id) {
		return userService.get(id);
		
	}
	
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	@ResponseBody
	public String update(User user) {
		try {
			userService.update(user);
			return "update success";
		}catch(Exception e){
			e.printStackTrace();
			return "update error.";
		}
	}
	@RequestMapping("/add/{name}/{birthday}/{address}")
	@ResponseBody
	public String add(User user) {
		try {
			userService.add(user);
			return "add sucess.";
		}catch(Exception e) {
			e.printStackTrace();
			return "add erorr.";
		}
	}
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public String delete(@PathVariable Integer id) {
		try {
			userService.delete(id);
			return "delete sucess.";
		}catch(Exception e) {
			e.printStackTrace();
			return "delete error.";
		}
	}

}

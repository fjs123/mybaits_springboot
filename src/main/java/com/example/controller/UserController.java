package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserEntity;
import com.example.mapper.UserMapper;

@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;


	@RequestMapping("/findAll")
	public List<UserEntity> findAll() {

		List<UserEntity> list = userMapper.getAll();

		return list;

	}

	@RequestMapping("/getUser")
	public UserEntity getUser(Long id) {
		UserEntity user = userMapper.getOne(id);
		return user;
	}

	@RequestMapping("/add")
	public void save(UserEntity user) {
		userMapper.insert(user);
	}

	@RequestMapping(value = "update")
	public void update(UserEntity user) {
		userMapper.update(user);
	}

	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		userMapper.delete(id);
	}
}

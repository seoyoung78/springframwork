package com.mycompany.webapp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.mycompany.webapp.dto.User;

@Mapper
public interface UsersDao {
	public int insert(User user);	//mapper의 id와 동일하게 매칭
	public User selectByUid(String uid);
}

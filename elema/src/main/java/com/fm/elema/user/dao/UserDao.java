package com.fm.elema.user.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fm.elema.user.vo.UserVo;

@Repository
public class UserDao {
	
	private final static String NAMESPACE = UserDao.class.getName() + ".";
	
	@Autowired
	SqlSession sqlSession;
	
	public UserVo findUserByMoblie(String mobile){
		HashMap< String, String> map = new HashMap<String, String>();
		map.put("mobile", mobile);
		//呵呵
		return sqlSession.selectOne(NAMESPACE+"findUserByMobile", map);
	}
	
	public UserVo findUserByMoblieAndPwd(String mobile, String pwd){
		HashMap< String, String> map = new HashMap<String, String>();
		map.put("mobile", mobile);
		map.put("pwd", pwd);
		return sqlSession.selectOne(NAMESPACE+"findUserByMobileAndPwd", map);
	}

}

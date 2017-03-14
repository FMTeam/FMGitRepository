package com.fm.elema.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fm.elema.common.exception.BusinessException;
import com.fm.elema.common.exception.ErrorNum;
import com.fm.elema.user.dao.UserDao;
import com.fm.elema.user.vo.UserVo;
import com.fm.elema.util.MD5Util;

@Service
public class UserService {
	
	protected static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	UserDao userDao;
	
	/**
	 * 登录
	 * 
	 * @param mobile
	 * @param pwd
	 * @return
	 */
	public UserVo login(String mobile, String pwd) {
		UserVo vo = null;
		vo  = userDao.findUserByMoblie(mobile);
		if(vo==null){
			throw  new BusinessException(ErrorNum.LOGIN_MOBILE_ERROR.index,ErrorNum.LOGIN_MOBILE_ERROR.name);
		}else{
			//fkelfdjf
			vo  = userDao.findUserByMoblieAndPwd(mobile, pwd);
			if(vo==null){
				throw  new BusinessException(ErrorNum.LOGIN_PASSWORD_ERROR.index,ErrorNum.LOGIN_PASSWORD_ERROR.name);
			}else{
				return vo;
			}
			
		}	
	}
	
}

package com.fm.elema.controller.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fm.elema.boot.config.GlobalConfig;
import com.fm.elema.common.BaseRespond;
import com.fm.elema.common.exception.BusinessException;
import com.fm.elema.user.service.UserService;
import com.fm.elema.user.vo.UserVo;

@Controller
@RequestMapping("/account")
public class UserController {
	
	private Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	GlobalConfig GlobalConfig;
	
	@Autowired
	UserService userService;
	
	 /**
     * 登录
     * @param mobile
     * @param pwd
     * @return
     * @throws BusinessException
     */
    @ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public BaseRespond<UserVo> login (@RequestParam(required = true,value="mobile" ) String mobile,
			@RequestParam(required = true,value="pwd") String pwd)throws BusinessException{
    	LOG.info("【饿了吗-登录】-访问【POST /account/login】接口  params[mobile:" + mobile+",pwd:"+pwd+"]");
    	BaseRespond<UserVo> br = new BaseRespond<UserVo>();
    	br.setData(userService.login(mobile, pwd));
    	br.setMessage("登录成功!");
		return br;
	}
	
}

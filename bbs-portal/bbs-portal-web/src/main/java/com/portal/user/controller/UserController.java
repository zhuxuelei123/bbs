package com.portal.user.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bbs.common.pojo.BbsResult;
import com.bbs.common.util.ExceptionUtil;
import com.bbs.common.util.IDUtils;
import com.portal.user.pojo.BbsUser;
import com.portal.user.service.BbsUserService;
/**
 * 用户类 controller 层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private BbsUserService bbsUserService;
	
	@RequestMapping("/register")
	@ResponseBody
	public BbsResult register(){
		BbsUser user = new BbsUser();
		user.setId(IDUtils.createUUId());
		user.setUsername("admin");
		user.setPassword("admin");
		user.setNikename("系统管理员");
		user.setGender("M");
		user.setAvatar("/image/admin.jpg");
		user.setEmail("admin@163.com");
		user.setPhone("18062798733");
		user.setRegisterTime(new Date());
		//user.setLoginTime(new Date());
		user.setLoginIp("192.168.0.1");
		user.setIdentity("0");
		user.setStatus("0");
		boolean flag = false;
		try {
			flag = bbsUserService.register(user);
		} catch (Exception e) {
			e.printStackTrace();
			return BbsResult.build(500, "用户注册失败", ExceptionUtil.getStackTrace(e));
		}
		return BbsResult.ok(flag);
	}
	
}

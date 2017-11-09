package com.portal.swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.portal.user.pojo.BbsUser;
import com.portal.user.service.BbsUserService;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Controller
public class SwaggerController {
	@Autowired
	private BbsUserService bbsUserService;
	@RequestMapping(value="/name/{name}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据用户名获取用户对象", httpMethod = "GET", response = BbsUser.class, notes = "根据用户名获取用户对象")
	public BbsUser getUserByName(@ApiParam(required = true, name = "name", value = "用户名") @PathVariable String name) throws Exception{
	    BbsUser user = bbsUserService.getUserByName(name);
	    if(user != null) {
	      return user;
	    } else {
	        throw new Exception("根据{name=" + name + "}获取不到UcUser对象");
	    }
	}
}

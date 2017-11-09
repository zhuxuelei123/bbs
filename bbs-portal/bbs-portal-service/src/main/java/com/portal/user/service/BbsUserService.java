package com.portal.user.service;

import com.portal.user.pojo.BbsUser;
/**
 * 用户serviece接口
 * @author Administrator
 */
public interface BbsUserService {
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public boolean register(BbsUser user);
	/**
	 * 根据用户名
	 * @param id
	 * @return
	 */
	public BbsUser getUserByName(String name);
}

package com.portal.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portal.user.mapper.BbsUserMapper;
import com.portal.user.pojo.BbsUser;
import com.portal.user.pojo.BbsUserExample;
import com.portal.user.service.BbsUserService;
/**
 * 添加用户实现层
 * @author Administrator
 *
 */
@Service
public class BbsUserServiceImpl implements BbsUserService {
	
	@Autowired
	private BbsUserMapper bbsUserMapper;
	
	/**
	 * 添加用户
	 */
	@Override
	public boolean register(BbsUser user) {
		int userRows = bbsUserMapper.insert(user);
		
		if(userRows > 0){
			return true;
		}else {
			return false;
		}
	
	}
	/**
	 * 根据用户名查询
	 */
	@Override
	public BbsUser getUserByName(String name) {
		BbsUserExample example =new BbsUserExample();
		example.createCriteria().andUsernameEqualTo(name);
		List<BbsUser> listUser = bbsUserMapper.selectByExample(example);
		if(listUser!=null&&listUser.size()>0){
		return listUser.get(0);
		}
		return null;
	}
	

	
}

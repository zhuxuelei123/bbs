package com.portal.user.mapper;

import com.portal.user.pojo.BbsUser;
import com.portal.user.pojo.BbsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsUserMapper {
    int countByExample(BbsUserExample example);

    int deleteByExample(BbsUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(BbsUser record);

    int insertSelective(BbsUser record);

    List<BbsUser> selectByExample(BbsUserExample example);

    BbsUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BbsUser record, @Param("example") BbsUserExample example);

    int updateByExample(@Param("record") BbsUser record, @Param("example") BbsUserExample example);

    int updateByPrimaryKeySelective(BbsUser record);

    int updateByPrimaryKey(BbsUser record);
}
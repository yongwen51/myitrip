package cn.itrip.dao;

import cn.irip.beans.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 根据分页查询查询
     * @param params
     * @return
     */
    List<User> getUsersByParams(Map<String,Object> params);

    /**
     * 根据条件查询个数总数
     * @param params
     * @return
     */


    int getUsersCountByParams(Map<String,Object> params);
}

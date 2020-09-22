package cn.itrip.service;

import cn.irip.beans.pojo.User;
import cn.itrip.common.Page;

/**
 * 用户的业务逻辑服务接口
 */
public interface UserService {
    /**
     * 各木块的分页查询
     * @param pageIndex
     * @param pageSize
     * @param userName
     * @return
     */
    Page<User> getPagedUsers(int pageIndex,String userName);




}

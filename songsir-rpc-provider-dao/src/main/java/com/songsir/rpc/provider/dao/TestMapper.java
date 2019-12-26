package com.songsir.rpc.provider.dao;

import com.songsir.rpc.bean.User;

import java.util.List;

/**
 * @PackageName com.songsir.rpc.provider.dao
 * @ProjectName songsir-rpc-parent
 * @Author: SongYapeng
 * @Date: Create in 15:35 2019/12/26
 * @Description:
 * @Copyright Copyright (c) 2019, songsir01@163.com All Rights Reserved.
 */
public interface TestMapper {

    List<User> getUserListByUid(User user);

}

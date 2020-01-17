package com.songsir.rpc.provider.service;

import com.songsir.rpc.bean.User;

import java.util.List;

/**
 * @PackageName com.songsir.rpc.provider.service
 * @ProjectName songsir-rpc-parent
 * @Author: SongYapeng
 * @Date: Create in 20:29 2019/12/14
 * @Description:
 * @Copyright Copyright (c) 2019, songsir01@163.com All Rights Reserved.
 */
public interface TestProviderService {

    /**
     * @MethodName getHelloWorld
     * @Description 测试
     * @Author SongYapeng
     * @Date 2019/12/14 20:29
     * @param msg
     * @Since JDK 1.8
     */
    String getHelloWorld(String msg);

    /**
     * @MethodName getUserByUid
     * @Description 测试查询
     * @Author SongYapeng
     * @Date 2019/12/26 15:58
     * @param user
     * @Since JDK 1.8
     */
    List<User> getUserByUid(User user);

    /**
     * @MethodName testUseHttpOrRpc
     * @Description 该接口测试http调用和rpc调用
     * @Author SongYapeng
     * @Date 2020/1/17 10:20
     * @param
     * @Since JDK 1.8
     */
    String testUseHttpOrRpc();

}

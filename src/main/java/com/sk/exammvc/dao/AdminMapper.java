package com.sk.exammvc.dao;

import com.sk.exammvc.entity.Admin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {

    /**
    * 查找全部管理员
    *
    * @return java.util.List<com.sk.exammvc.entity.Admin>
    **/
    List<Admin> findAll();

    /**
    * 按照id查找管理员
    *
    * @param adminId 管理员账号
    * @return com.sk.exammvc.entity.Admin
    **/
    Admin findById(Integer adminId);

    /**
    * 删除管理员
    *
    * @param adminId 管理员账号
    * @return int
    **/
    int deleteById(int adminId);

    /**
    * 更新管理员的信息
    *
    * @param admin 管理员信息
    * @return int
    **/
    int update(Admin admin);

    /**
    * 添加管理员
    *
    * @param admin 管理员信息
    * @return int
    **/
    @Options(useGeneratedKeys = true, keyProperty = "adminId")
    int add(Admin admin);
}

package com.sk.exammvc.service;

import com.sk.exammvc.entity.Admin;
import com.sk.exammvc.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
    * 查询所有管理员
    *
    * @return java.util.List<com.sk.exammvc.entity.Admin>
    **/
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }

    /**
    * 按照id查找管理员
    *
    * @param adminId 管理员账号
    * @return com.sk.exammvc.entity.Admin
    **/
    public Admin findById(Integer adminId) {
        return adminMapper.findById(adminId);
    }

    /**
    * 删除管理员
    *
    * @param adminId 管理员账号
    * @return int
    **/
    public int deleteById(int adminId) {
        return adminMapper.deleteById(adminId);
    }

    /**
    * 修改管理员信息
    *
    * @param admin 管理员信息
    * @return int
    **/
    public int update(Admin admin) {
        return adminMapper.update(admin);
    }

    /**
    * 增加管理员
    *
    * @param admin 管理员信息
    * @return int
    **/
    public int add(Admin admin) {
        return 0;
    }
}

package com.sk.exammvc.mapper;

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
    @Select("select adminName,sex,tel,email,cardId,role from admin")
    List<Admin> findAll();

    /**
    * 按照id查找管理员
    *
    * @param adminId 管理员账号
    * @return com.sk.exammvc.entity.Admin
    **/
    @Select("select adminName,sex,tel,email,cardId,role from admin where adminId = #{adminId}")
    Admin findById(Integer adminId);

    /**
    * 删除管理员
    *
    * @param adminId 管理员账号
    * @return int
    **/
    @Delete("delete from admin where adminId = #{adminId}")
    int deleteById(int adminId);

    /**
    * 更新管理员的信息
    *
    * @param admin 管理员信息
    * @return int
    **/
    @Update("update admin set adminName = #{adminName},sex = #{sex}," +
            "tel = #{tel}, email = #{email},pwd = #{pwd},cardId = #{cardId},role = #{role} where adminId = #{adminId}")
    int update(Admin admin);

    /**
    * 添加管理员
    *
    * @param admin 管理员信息
    * @return int
    **/
    @Options(useGeneratedKeys = true, keyProperty = "adminId")
    @Insert("insert into admin(adminName,sex,tel,email,pwd,cardId,role) " +
            "values(#{adminName},#{sex},#{tel},#{email},#{pwd},#{cardId},#{role})")
    int add(Admin admin);
}

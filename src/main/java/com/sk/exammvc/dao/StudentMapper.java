package com.sk.exammvc.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {

    /**
     * 分页查询所有学生
     *
     * @param page 分页对象
     * @return List<Student>
     */

    IPage<Student> findAll(Page page);

    /**
    * 根据学号查学生的信息
    *
    * @param studentId 学号
    * @return com.sk.exammvc.entity.Student
    **/
    @Select("select * from student where studentId = #{studentId}")
    Student findById(Integer studentId);

    /**
    * 删除学生
    *
    * @param studentId 学号
    * @return int
    **/
    @Delete("delete from student where studentId = #{studentId}")
    int deleteById(Integer studentId);

    /**
     *更新所有学生信息
     *
     * @param student 传递一个对象
     * @return 受影响的记录条数
     */
    @Update("update student set studentName = #{studentName},grade = #{grade},major = #{major},clazz = #{clazz}," +
            "institute = #{institute},tel = #{tel},pwd = #{pwd},cardId = #{cardId},sex = #{sex},role = #{role} " +
            "where studentId = #{studentId}")
    int update(Student student);

    /**
     * 更新密码
     *
     * @param student 学生信息
     * @return 受影响的记录条数
     */
    @Update("update student set pwd = #{pwd} where studentId = #{studentId}")
    int updatePwd(Student student);

    /**
    * 添加学生
    *
    * @param student 学生信息
    * @return int
    **/
    @Options(useGeneratedKeys = true,keyProperty = "studentId")
    @Insert("insert into student(studentName,grade,major,clazz,institute,tel,pwd,cardId,sex,role) values " +
            "(#{studentName},#{grade},#{major},#{clazz},#{institute},#{tel},#{pwd},#{cardId},#{sex},#{role})")
    int add(Student student);
}

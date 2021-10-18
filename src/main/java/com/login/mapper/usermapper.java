//package com.login.mapper;
//
//import com.login.domain.user;
//import org.apache.ibatis.annotations.Insert;
////import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//
//public class usermapper {
//    //查询，可以实现登录功能
//    @Select("SELECT * FROM user WHERE name = #{name} AND password = #{password}")
//    public user getInfo(@Param("name") String name, @Param("password") int age) {
//        return null;
//    }
//
//    //多个参数要加@Param修饰
//    //增加，可以实现注册功能
//    @Insert("insert into user(name,password)values(#{name},#{password})")
//    public void saveInfo(@Param("name") String name, @Param("password") int age) {
//    }
//
//}

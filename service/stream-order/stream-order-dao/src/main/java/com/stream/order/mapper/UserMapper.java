package com.stream.order.mapper;

import com.stream.order.entity.UserEntity;
import com.stream.order.entity.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select id id,user_name user_name,pass_word pass_word,user_sex user_sex,nick_name nick_name from users")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "passWord", column = "pass_word"),
            @Result(property = "userSex",column = "user_sex",javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<UserEntity> getAll();

    @Select("select id id,user_name userName,pass_word passWord,user_sex userSex,nick_name nickName from users where id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "userSex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nickName")
    })
    UserEntity getOne(Long id);

    @Insert("insert into users(user_name,pass_word,user_sex) values(#{userName}, #{passWord}, #{userSex})")
    void insert(UserEntity user);


    @Update("update users set user_name=#{userName},nick_name=#{nickName} where id =#{id}")
    void update(UserEntity user);

    @Delete("delete from users where id =#{id}")
    void delete(Long id);

}

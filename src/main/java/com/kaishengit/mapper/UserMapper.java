package com.kaishengit.mapper;

import com.kaishengit.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhangyu on 2017/10/24.
 */
public interface UserMapper {

    int add(User user);
    int update(User user);
    int delete(int id);
    List<User> findAll();
    User findById(int id);
    List<User> page(@Param("offset")int offset,@Param("size")int size);
    User find(int id);

}

package com.partTi.service.user;

import com.partTi.pojo.user.User;
import com.partTi.utils.ResponseDate;

public interface UserService {

    ResponseDate getUserByAny(User user,Integer index,Integer pageSize);

    ResponseDate getUserById(Integer id);

    ResponseDate getUserByUsername(String username);

    ResponseDate saveUser(User user);

    ResponseDate updateUser(User user);

    ResponseDate deleteUser(Integer id);

    ResponseDate countUser(User user, Integer index, Integer pageSize);
}

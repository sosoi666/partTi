package com.partTi.service.user;

import com.partTi.pojo.user.Role;
import com.partTi.utils.ResponseDate;

public interface RoleService {

    ResponseDate getRoleById(Integer id);

    ResponseDate getAllRole();

    ResponseDate saveRole(Role role);

    ResponseDate updateRole(Role role);

    ResponseDate deleteRole(Integer id);

}

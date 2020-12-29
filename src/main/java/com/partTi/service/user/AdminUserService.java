package com.partTi.service.user;

import com.partTi.pojo.user.AdminUser;
import com.partTi.utils.ResponseDate;

public interface AdminUserService {

    ResponseDate getAdminUserById(Integer id);

    ResponseDate saveAdminUser(AdminUser adminUser);

    ResponseDate updateAdminUser(AdminUser adminUser);

    ResponseDate deleteAdminUser(Integer id);

}

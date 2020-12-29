package com.partTi.service.user;

import com.partTi.pojo.user.CommonUser;
import com.partTi.utils.ResponseDate;

public interface CommonUserService {

    ResponseDate getCommonUserById(Integer id);

    ResponseDate saveCommonUser(CommonUser commonUser);

    ResponseDate updateCommonUser(CommonUser commonUser);

    ResponseDate deleteCommonUser(Integer id);
}

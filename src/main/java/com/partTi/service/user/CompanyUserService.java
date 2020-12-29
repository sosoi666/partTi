package com.partTi.service.user;

import com.partTi.pojo.user.CompanyUser;
import com.partTi.utils.ResponseDate;

public interface CompanyUserService {

    ResponseDate getCompanyUserById(Integer id);

    ResponseDate saveCompanyUser(CompanyUser companyUser);

    ResponseDate updateCompanyUser(CompanyUser companyUser);

    ResponseDate deleteCompanyUser(Integer id);
}

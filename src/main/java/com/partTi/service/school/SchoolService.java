package com.partTi.service.school;

import com.partTi.pojo.school.School;
import com.partTi.utils.ResponseDate;

public interface SchoolService {

    ResponseDate getAllSchool();

    ResponseDate getSchoolById(Integer id);

    ResponseDate insertSchool(School school);

    ResponseDate updateSchool(School school);

    ResponseDate deleteSchool(Integer id);
}

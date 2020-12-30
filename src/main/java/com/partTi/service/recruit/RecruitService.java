package com.partTi.service.recruit;

import com.partTi.pojo.recruit.Recruit;
import com.partTi.utils.ResponseDate;
import org.apache.ibatis.annotations.Param;

public interface RecruitService {

    ResponseDate getIndentDetailByAny(Recruit recruit,Integer index,Integer pageSize,String sort);

    ResponseDate countRecruit(Recruit recruit,String sort);

    ResponseDate getRecruitById(String id);

    ResponseDate insertRecruit(Recruit recruit);

    ResponseDate updateRecruit(Recruit recruit);

    ResponseDate deleteRecruitById(String id);

}

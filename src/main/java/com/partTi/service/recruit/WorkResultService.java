package com.partTi.service.recruit;

import com.partTi.pojo.recruit.WorkResult;
import com.partTi.utils.ResponseDate;

public interface WorkResultService {

    ResponseDate getWorkResultByAny(WorkResult workResult,Integer index,Integer pageSize,String sort);

    ResponseDate countWorkResultByAny(WorkResult workResult,String sort);

    ResponseDate getWorkResultById(Integer id);

    ResponseDate insertWorkResult(WorkResult workResult);

    ResponseDate updateWorkResult(WorkResult workResult);

    ResponseDate deleteWorkResult(Integer id);
}

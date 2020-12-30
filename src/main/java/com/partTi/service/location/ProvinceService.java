package com.partTi.service.location;

import com.partTi.utils.ResponseDate;

public interface ProvinceService {

    ResponseDate getAllProvinces();

    ResponseDate getProvincesById(Integer id);
}

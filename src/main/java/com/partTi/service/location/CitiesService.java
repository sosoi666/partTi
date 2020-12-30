package com.partTi.service.location;

import com.partTi.utils.ResponseDate;

public interface CitiesService {

    ResponseDate getCitiesByProvinceId(Integer id);

    ResponseDate getCityById(Integer id);
}

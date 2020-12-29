package com.partTi.dao.location;

import com.partTi.pojo.location.Cities;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CitiesDao {
    /**
     * 根据省份ID查出所有城市
     * @return
     */
    @Select("SELECT * FROM cities WHERE provinceid = #{id}")
    @Results(
            id="cityMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "cityid",property = "cityId"),
            @Result(column = "city",property = "city"),
            @Result(column = "provinceid",property = "provinceId")
            })
    List<Cities> getCitiesByProvinceId(Integer id);

    @Select("SELECT * FROM cities WHERE id = #{id}")
    @ResultMap("cityMap")
    Cities getCityById(Integer id);
}

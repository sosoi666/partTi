package com.partTi.dao.location;

import com.partTi.pojo.location.Provinces;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface ProvincesDao {

    /**
     * 获取所有省份信息并级联查询城市
     * @return
     */
    @Select("SELECT * FROM provinces")
    @Results(id="provincesMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "provinceid",property = "provinceId"),
            @Result(column = "province",property = "province"),
            @Result(property = "cities",column = "provinceid",many=@Many(select = "com.partTi.dao.location.CitiesDao.getCitiesByProvinceId",fetchType = FetchType.LAZY))
    })
    List<Provinces> getAllProvinces();

    /**
     * 根据ID获取省份信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM provinces WHERE id = #{id}")
    @ResultMap("provincesMap")
    Provinces getProvincesById(Integer id);
}

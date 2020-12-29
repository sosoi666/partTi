package com.partTi.dao.recruit;

import com.partTi.pojo.recruit.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryDao {

    @Select("SELECT * FROM category")
    @Results(id="categoryMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "detail",property = "detail")
    })
    List<Category> getAllCategory();

    @Select("SELECT * FROM category WHERE id = #{id}")
    @ResultMap("categoryMap")
    Category getCategoryById(Integer id);

}

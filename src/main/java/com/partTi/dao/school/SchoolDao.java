package com.partTi.dao.school;

import com.partTi.pojo.school.School;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SchoolDao {

    @Select("SELECT * FROM school")
    @Results(id="schoolMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "detail",property = "detail"),
            @Result(column = "location",property = "location"),
            @Result(column = "badge_img",property = "badgeImg")
    })
    List<School> getAllSchool();

    @Select("SELECT * FROM school WHERE id = #{id}")
    @ResultMap("schoolMap")
    School getSchoolById(Integer id);

    @Insert("INSERT INTO school (id,name,detail,location,badge_img) values(#{id},#{name},#{detail},#{location},#{badgeImg})")
    int insertSchool(School school);

    @Update("UPDATE school SET name=#{name},detail=#{detail},location=#{location},badge_img=#{badgeImg} WHERE id=#{id}")
    int updateSchool(School school);

    @Delete("delete from school where id=#{id}")
    int deleteSchool(School school);
}

package com.partTi.dao.recruit;

import com.partTi.pojo.recruit.Recruit;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface RecruitDao {
    /**
     * 根据条件模糊查询招聘信息，包括，企业ID，学校ID，招聘地区，招聘类型，工作时间类型，结算类型，状态,关键词搜索，分页查询和按照创建时间排序等
     * @param recruit
     * @param index
     * @param pageSize
     * @param sort
     * @return
     */
    @Select("<script>"
            + "SELECT * FROM recruit"
            + " <where>"
            + " 	<if test='recruit.id != null or recruit.title != null or recruit.detail != null ' > "
            + "	    and ( id like '%${recruit.id}%' or title like '%${recruit.title}%' or detail like '%${recruit.detail}%')"
            + "	</if>"
            + " 	<if test='recruit.categoryId != null' > "
            + "	    and categoryid = #{recruit.categoryId}"
            + "	</if>"
            + "     <if test='recruit.workTimeType != null'>"
            + "     and work_time_type = #{recruit.workTimeType}"
            + " </if>"
            + "     <if test='recruit.salaryWay != null'>"
            + "     and salary_way = #{recruit.salaryWay}"
            + " </if>"
            + "     <if test='recruit.cid != null'>"
            + "     and cid = #{recruit.cid}"
            + " </if>"
            + "     <if test='recruit.sid != null'>"
            + "     and sid = #{recruit.sid}"
            + " </if>"
            + "     <if test='recruit.location != null'>"
            + "     and location = #{recruit.location}"
            + " </if>"
            + "     <if test='recruit.state != null'>"
            + "     and state = #{recruit.state}"
            + " </if>"
            + "</where>"
            + "ORDER BY create_time ${sort} limit #{index},#{pageSize}"
            + "</script>")
    @Results(id="recruitMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "title",property = "title"),
            @Result(column = "detail",property = "detail"),
            @Result(column = "categoryid",property = "categoryId"),
            @Result(column = "start_time",property = "startTime"),
            @Result(column = "end_time",property = "endTime"),
            @Result(column = "work_time_type",property = "workTimeType"),
            @Result(column = "salary",property = "salary"),
            @Result(column = "salary_way",property = "salaryWay"),
            @Result(column = "num",property = "num"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "cid",property = "cid"),
            @Result(column = "sid",property = "sid"),
            @Result(column = "location",property = "location"),
            @Result(column = "state",property = "state"),
            @Result(property = "category",column = "categoryid",one=@One(select = "com.partTi.dao.recruit.CategoryDao.getCategoryById",fetchType = FetchType.EAGER)),
            @Result(property = "companyUser",column = "cid",one=@One(select = "com.partTi.dao.user.CompanyUserDao.getCompanyUserById",fetchType = FetchType.EAGER)),
            @Result(property = "school",column = "sid",one=@One(select = "com.partTi.dao.school.SchoolDao.getSchoolById",fetchType = FetchType.EAGER)),
            @Result(property = "cities",column = "location",one=@One(select = "com.partTi.dao.location.CitiesDao.getCityById",fetchType = FetchType.EAGER))
    })
    List<Recruit> getIndentDetailByAny(@Param("recruit") Recruit recruit, @Param("index") Integer index, @Param("pageSize") Integer pageSize, @Param("sort") String sort);

    @Select("<script>"
            + "SELECT COUNT(*) count FROM recruit"
            + " <where>"
            + " 	<if test='recruit.id != null or recruit.title != null or recruit.detail != null ' > "
            + "	    and ( id like '%${recruit.id}%' or title like '%${recruit.title}%' or detail like '%${recruit.detail}%')"
            + "	</if>"
            + " 	<if test='recruit.categoryId != null' > "
            + "	    and categoryid = #{recruit.categoryId}"
            + "	</if>"
            + "     <if test='recruit.workTimeType != null'>"
            + "     and work_time_type = #{recruit.workTimeType}"
            + " </if>"
            + "     <if test='recruit.salaryWay != null'>"
            + "     and salary_way = #{recruit.salaryWay}"
            + " </if>"
            + "     <if test='recruit.cid != null'>"
            + "     and cid = #{recruit.cid}"
            + " </if>"
            + "     <if test='recruit.sid != null'>"
            + "     and sid = #{recruit.sid}"
            + " </if>"
            + "     <if test='recruit.location != null'>"
            + "     and location = #{recruit.location}"
            + " </if>"
            + "     <if test='recruit.state != null'>"
            + "     and state = #{recruit.state}"
            + " </if>"
            + "</where>"
            + "ORDER BY create_time ${sort}"
            + "</script>")
    Integer countRecruit(@Param("recruit") Recruit recruit, @Param("sort") String sort);


    @Select("SELECT * FROM recruit WHERE id = #{id}")
    @ResultMap("recruitMap")
    Recruit getRecruitById(String id);


    /**
     * 新增招聘信息
     * @param recruit
     * @return
     */
    @Insert("INSERT into recruit (id,title,detail,categoryid,start_time,end_time,work_time_type,salary,salary_way,num,create_time,cid,sid,location,state) values(#{id},#{title},#{detail},#{categoryId},#{startTime},#{endTime},#{workTimeType},#{salary},#{salaryWay},#{num},#{createTime},#{cid},#{sid},#{location},#{state})")
    int insertRecruit(Recruit recruit);

    /**
     * 更新招聘信息
     * @param recruit
     * @return
     */
    @Update("UPDATE recruit set title=#{title},detail=#{detail},categoryid=#{categoryId},start_time=#{startTime},end_time=#{endTime},work_time_type=#{workTimeType},salary=#{salary},salary_way=#{salaryWay},num=#{num},create_time=#{createTime},cid=#{cid},sid=#{sid},location=#{location},state=#{state} WHERE id=#{id}")
    int updateRecruit(Recruit recruit);

    /**
     * 删除招聘信息
     * @param id
     * @return
     */
    @Delete("DELETE FROM recruit WHERE id=#{id}")
    int deleteRecruitById(String id);

    /**
     * 将招聘信息状态设为正在招聘
     * @param id
     * @return
     */
    @Update("UPDATE recruit set state = 1 WHERE id = #{id}")
    Integer setRecruitTrue(String id);

    /**
     * 将招聘信息状态设为未在招聘
     * @param id
     * @return
     */
    @Update("UPDATE recruit set state = 0 WHERE id = #{id}")
    Integer setRecruitFalse(String id);

}

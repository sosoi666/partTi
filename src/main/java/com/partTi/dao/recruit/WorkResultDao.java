package com.partTi.dao.recruit;

import com.partTi.pojo.recruit.WorkResult;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface WorkResultDao {

    @Select("<script>"
            + "SELECT * FROM work_result"
            + " <where>"
            + " 	<if test='workResult.uid != null' > "
            + "	    and uid = #{workResult.uid}"
            + "	</if>"
            + "     <if test='workResult.recruitId != null'>"
            + "     and recruit_id = #{workResult.recruitId}"
            + " </if>"
            + "     <if test='workResult.resumeId != null'>"
            + "     and resume_id = #{workResult.resumeId}"
            + " </if>"
            + "     <if test='workResult.state != null'>"
            + "     and state = #{workResult.state}"
            + " </if>"
            + "</where>"
            + "ORDER BY create_time ${sort} limit #{index},#{pageSize}"
            + "</script>")
    @Results(id="workResultMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "uid",property = "uid"),
            @Result(column = "recruit_id",property = "recruitId"),
            @Result(column = "salary",property = "salary"),
            @Result(column = "resume_id",property = "resumeId"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "state",property = "state"),
            @Result(property = "commonUser",column = "uid",one=@One(select = "com.partTi.dao.user.CommonUserDao.getCommonUserById",fetchType = FetchType.EAGER)),
            @Result(property = "recruit",column = "recruit_id",one=@One(select = "com.partTi.dao.recruit.RecruitDao.getRecruitById",fetchType = FetchType.EAGER)),
            @Result(property = "resume",column = "resume_id",one=@One(select = "com.partTi.dao.resume.ResumeDao.getResumeById",fetchType = FetchType.EAGER))
    })
    List<WorkResult> getWorkResultByAny(@Param("workResult") WorkResult workResult, @Param("index") Integer index, @Param("pageSize") Integer pageSize, @Param("sort") String sort);

    @Select("<script>"
            + "SELECT COUNT(*) count FROM work_result"
            + " <where>"
            + " 	<if test='workResult.uid != null' > "
            + "	    and uid = #{workResult.uid}"
            + "	</if>"
            + "     <if test='workResult.recruitId != null'>"
            + "     and recruit_id = #{workResult.recruitId}"
            + " </if>"
            + "     <if test='workResult.resumeId != null'>"
            + "     and resume_id = #{workResult.resumeId}"
            + " </if>"
            + "     <if test='workResult.state != null'>"
            + "     and state = #{workResult.state}"
            + " </if>"
            + "</where>"
            + "ORDER BY create_time ${sort}"
            + "</script>")
    int countWorkResultByAny(@Param("workResult") WorkResult workResult, @Param("sort") String sort);

    @Select("SELECT * FROM work_result WHERE id = #{id}")
    @ResultMap("workResultMap")
    WorkResult getWorkResultById(Integer id);

    @Insert("INSERT INTO work_result (id,uid,recruit_id,salary,resume_id,create_time,state) values(#{id},#{uid},#{recruitId},#{salary},#{resumeId},#{createTime},#{state})")
    int insertWorkResult(WorkResult workResult);

    @Update("UPDATE work_result SET uid=#{uid},recruit_id=#{recruitId},salary=#{salary},resume_id=#{resumeId},create_time=#{createTime},state=#{state} WHERE id=#{id}")
    int updateWorkResult(WorkResult workResult);

    @Delete("delete from work_result where id=#{id}")
    int deleteWorkResult(Integer id);
}


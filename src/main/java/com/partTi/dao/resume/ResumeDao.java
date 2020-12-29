package com.partTi.dao.resume;


import com.partTi.pojo.resume.Resume;
import com.partTi.pojo.school.School;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface ResumeDao {

    /**
     *查询简历，可以根据用户ID和学校ID筛选
     * @param resume
     * @param index
     * @param pageSize
     * @param sort
     * @return
     */
    @Select("<script>"
            + "SELECT * FROM resume"
            + " <where>"
            + " 	<if test='resume.uid != null' > "
            + "	    and uid = #{resume.uid}"
            + "	</if>"
            + "     <if test='resume.school != null'>"
            + "     and school = #{resume.school}"
            + " </if>"
            + "</where>"
            + "ORDER BY create_time ${sort} limit #{index},#{pageSize}"
            + "</script>")
    @Results(id="resumeMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "uid",property = "uid"),
            @Result(column = "name",property = "name"),
            @Result(column = "gender",property = "gender"),
            @Result(column = "age",property = "age"),
            @Result(column = "pic_src",property = "picSrc"),
            @Result(column = "school",property = "school"),
            @Result(column = "major",property = "major"),
            @Result(column = "phone",property = "phone"),
            @Result(column = "email",property = "email"),
            @Result(column = "exp",property = "exp"),
            @Result(column = "skill",property = "skill"),
            @Result(column = "award",property = "award"),
            @Result(column = "self_evaluation",property = "selfEvaluation"),
            @Result(column = "create_time",property = "createTime"),
            @Result(property = "commonUser",column = "uid",one=@One(select = "com.partTi.dao.user.CommonUserDao.getCommonUserById",fetchType = FetchType.EAGER)),
            @Result(property = "mySchool",column = "school",one=@One(select = "com.partTi.dao.school.SchoolDao.getSchoolById",fetchType = FetchType.EAGER))
    })
    List<Resume> getResumeByAny(@Param("resume") Resume resume, @Param("index") Integer index, @Param("pageSize") Integer pageSize, @Param("sort") String sort);


    /**
     * 统计简历数量，可以根据学校和用户ID筛选
     * @param resume
     * @param sort
     * @return
     */
    @Select("<script>"
            + "SELECT COUNT(*) count FROM resume"
            + " <where>"
            + " 	<if test='resume.uid != null' > "
            + "	    and uid = #{resume.uid}"
            + "	</if>"
            + "     <if test='resume.school != null'>"
            + "     and school = #{resume.school}"
            + " </if>"
            + "</where>"
            + "ORDER BY create_time ${sort}"
            + "</script>")
    int countResume(@Param("resume") Resume resume, @Param("sort") String sort);

    /**
     * 根据ID获取简历
     * @param id
     * @return
     */
    @Select("SELECT * FROM resume WHERE id = #{id}")
    @ResultMap("resumeMap")
    Resume getResumeById(Integer id);

    /**
     * 新建简历
     * @param resume
     * @return
     */
    @Insert("INSERT into resume (id,uid,name,gender,age,pic_src,school,major,phone,email,exp,skill,award,self_evaluation,create_time) values(#{id},#{uid},#{name},#{gender},#{age},#{picSrc},#{school},#{major},#{phone},#{email},#{exp},#{skill},#{award},#{selfEvaluation},#{createTime})")
    int insertResume(Resume resume);

    /**
     * 更新简历
     * @param resume
     * @return
     */
    @Update("UPDATE resume set uid=#{uid},name=#{name},gender=#{gender},age=#{age},pic_src=#{picSrc},school=#{school},major=#{major},phone=#{phone},email=#{email},exp=#{exp},skill=#{skill},award=#{award},self_evaluation=#{selfEvaluation},create_time=#{createTime} WHERE id=#{id}")
    int updateResume(Resume resume);

    /**
     * 根据ID删除简历
     * @param id
     * @return
     */
    @Delete("DELETE FROM resume WHERE id=#{id}")
    int deleteResume(Integer id);

}

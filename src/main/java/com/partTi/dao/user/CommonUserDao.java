package com.partTi.dao.user;

import com.partTi.pojo.user.AdminUser;
import com.partTi.pojo.user.CommonUser;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommonUserDao {
    /**
     * 根据ID获取普通用户信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM common_user WHERE id = #{id}")
    @Results(id="commonUserMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "common_name",property = "commonName"),
            @Result(column = "gender",property = "gender"),
            @Result(column = "schoolid",property = "schoolId"),
            @Result(column = "description",property = "description"),
            @Result(column = "location",property = "location"),
            @Result(column = "phone",property = "phone"),
            @Result(column = "email",property = "email"),
            @Result(column = "head_img",property = "headImg")
    })
    public CommonUser getCommonUserById(Integer id);

    /**
     * 添加普通用户
     * @param commonUser
     * @return
     */
    @Insert("INSERT INTO common_user (id,common_name,gender,schoolid,description,location,phone,email,head_img) values(#{id},#{commonName},#{gender},#{schoolId},#{description},#{location},#{phone},#{email},#{headImg})")
    public int saveCommonUser(CommonUser commonUser);

    /**
     * 更新普通用户信息
     * @param commonUser
     * @return
     */
    @Update("UPDATE common_user SET common_name=#{commonName},gender=#{gender},schoolid=#{schoolId},description=#{description},location=#{location},phone=#{phone},email=#{email},head_img=#{headImg} WHERE id=#{id}")
    public int updateCommonUser(CommonUser commonUser);

    /**
     * 删除普通用户
     * @param id
     * @return
     */
    @Delete("delete from common_user where id=#{id}")
    public int deleteCommonUser(Integer id);
}

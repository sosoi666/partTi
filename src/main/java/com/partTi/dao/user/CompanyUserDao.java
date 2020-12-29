package com.partTi.dao.user;

import com.partTi.pojo.user.AdminUser;
import com.partTi.pojo.user.CommonUser;
import com.partTi.pojo.user.CompanyUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CompanyUserDao {
    /**
     * 根据ID获取企业用户信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM company_user WHERE id = #{id}")
    @Results(id="companyUserMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "company_name",property = "companyName"),
            @Result(column = "description",property = "description"),
            @Result(column = "location",property = "location"),
            @Result(column = "phone",property = "phone"),
            @Result(column = "email",property = "email"),
            @Result(column = "head_img",property = "headImg")
    })
    public CompanyUser getCompanyUserById(Integer id);


    /**
     * 添加企业用户
     * @param companyUser
     * @return
     */
    @Insert("INSERT INTO company_user (id,company_name,description,location,phone,email,head_img) values(#{id},#{companyName},#{description},#{location},#{phone},#{email},#{headImg})")
    public int saveCompanyUser(CompanyUser companyUser);

    /**
     * 更新企业用户信息
     * @param companyUser
     * @return
     */
    @Update("UPDATE company_user SET company_name=#{companyName},description=#{description},location=#{location},phone=#{phone},email=#{email},head_img=#{headImg} WHERE id=#{id}")
    public int updateCompanyUser(CompanyUser companyUser);

    /**
     * 删除企业用户
     * @param id
     * @return
     */
    @Delete("delete from company_user where id=#{id}")
    public int deleteCompanyUser(Integer id);
}

package com.partTi.dao.user;

import com.partTi.pojo.user.AdminUser;
import com.partTi.pojo.user.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AdminUserDao {

    /**
     * 根据ID获取管理员信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM admin_user WHERE id = #{id}")
    @Results(id="adminUserMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "admin_name",property = "adminName"),
            @Result(column = "gender",property = "gender"),
            @Result(column = "head_img",property = "headImg")
    })
    public AdminUser getAdminUserById(Integer id);

    /**
     * 添加管理员用户
     * @param adminUser
     * @return
     */
    @Insert("INSERT INTO admin_user (id,admin_name,gender,head_img) values(#{id},#{adminName},#{gender},#{headImg})")
    public int saveAdminUser(AdminUser adminUser);

    /**
     * 更新管理员用户信息
     * @param adminUser
     * @return
     */
    @Update("UPDATE admin_user SET admin_name=#{adminName},gender=#{gender},head_img=#{headImg} WHERE id=#{id}")
    public int updateAdminUser(AdminUser adminUser);

    /**
     * 删除管理员用户
     * @param id
     * @return
     */
    @Delete("delete from admin_user where id=#{id}")
    public int deleteAdminUser(Integer id);
}

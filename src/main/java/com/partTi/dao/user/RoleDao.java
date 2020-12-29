package com.partTi.dao.user;

import com.partTi.pojo.user.CompanyUser;
import com.partTi.pojo.user.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RoleDao {
    /**
     * 根据ID获取角色信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM role WHERE id = #{id}")
    @Results(id="roleMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "detail",property = "detail"),
            @Result(column = "description",property = "description")
    })
    public Role getRoleById(Integer id);

    /**
     * 获取所有角色信息
     * @return
     */
    @Select("SELECT * FROM role")
    @ResultMap("roleMap")
    public List<Role> getAllRole();

    /**
     * 添加角色
     * @param role
     * @return
     */
    @Insert("INSERT INTO role (id,detail,description) values(#{id},#{detail},#{description})")
    public int saveRole(Role role);

    /**
     * 更新角色信息
     * @param role
     * @return
     */
    @Update("UPDATE role SET detail=#{detail},description=#{description} WHERE id=#{id}")
    public int updateRole(Role role);

    /**
     * 删除角色
     * @param id
     * @return
     */
    @Delete("delete from role where id=#{id}")
    public int deleteRole(Integer id);
}

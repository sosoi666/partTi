package com.partTi.dao.user;

import com.partTi.pojo.user.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 根据所有条件模糊查询，并支持分页查询
     * @return
     */
    @Select("<script>"
            + "select * from indent "
            + " <where>"
            + " 	<if test='user.userName != null' > "
            + "	    and username like '%${user.userName}%'"
            + "	</if>"
            + " 	<if test='user.state != null' > "
            + "	    and state = #{user.state}"
            + "	</if>"
            + "</where>"
            + "limit #{index},#{pageSize}"
            + "</script>")
    @Results(id="userMap",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "username",property = "userName"),
            @Result(column = "password",property = "password"),
            @Result(column = "roleid",property = "roleId"),
            @Result(column = "state",property = "state")
    })
    public List<User> getUserByAny(@Param("user") User user, @Param("index") Integer index, @Param("pageSize") Integer pageSize);

    @Select("SELECT * FROM user WHERE id = #{id}")
    @ResultMap("userMap")
    public User getUserById(Integer id);

    @Select("SELECT * FROM user WHERE username = #{username}")
    @ResultMap("userMap")
    public User getUserByUsername(String username);

    /**
     * 新增用户
     * @return
     */
    @Insert("insert into user (id,username,password,roleid,state) values(#{id},#{userName},#{password},#{roleId},#{state})")
    public int saveUser(User user);

    /**
     * 更新用户信息
     * @return
     */
    @Update("update user set username=#{userName},password=#{password},roleid=#{roleId},state=#{state} where id=#{id}")
    public int updateUser(User user);

    /**
     * 删除用户信息
     * @return
     */
    @Delete("delete from user where id=#{id}")
    public int deleteUser(Integer id);


    /**
     * 根据条件统计用户数量，分页
     * @param user
     * @param index
     * @param pageSize
     * @return
     */
    @Select("<script>"
            + "select COUNT(*) count from indent "
            + " <where>"
            + " 	<if test='user.userName != null' > "
            + "	    and username like '%${user.userName}%'"
            + "	</if>"
            + " 	<if test='user.state != null' > "
            + "	    and state = #{user.state}"
            + "	</if>"
            + "</where>"
            + "limit #{index},#{pageSize}"
            + "</script>")
    public int countUser(@Param("user") User user, @Param("index") Integer index, @Param("pageSize") Integer pageSize);


}

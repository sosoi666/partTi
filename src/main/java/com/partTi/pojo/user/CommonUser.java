package com.partTi.pojo.user;

import java.io.Serializable;

public class CommonUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column common_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column common_user.common_name
     *
     * @mbggenerated
     */
    private String commonName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column common_user.gender
     *
     * @mbggenerated
     */
    private Integer gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column common_user.schoolid
     *
     * @mbggenerated
     */
    private Integer schoolId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column common_user.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column common_user.location
     *
     * @mbggenerated
     */
    private Integer location;

    private String phone;

    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column common_user.head_img
     *
     * @mbggenerated
     */
    private String headImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table common_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column common_user.id
     *
     * @return the value of common_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column common_user.id
     *
     * @param id the value for common_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column common_user.common_name
     *
     * @return the value of common_user.common_name
     *
     * @mbggenerated
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column common_user.common_name
     *
     * @param commonName the value for common_user.common_name
     *
     * @mbggenerated
     */
    public void setCommonName(String commonName) {
        this.commonName = commonName == null ? null : commonName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column common_user.gender
     *
     * @return the value of common_user.gender
     *
     * @mbggenerated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column common_user.gender
     *
     * @param gender the value for common_user.gender
     *
     * @mbggenerated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column common_user.schoolid
     *
     * @return the value of common_user.schoolid
     *
     * @mbggenerated
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column common_user.schoolid
     *
     * @param schoolId the value for common_user.schoolid
     *
     * @mbggenerated
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column common_user.description
     *
     * @return the value of common_user.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column common_user.description
     *
     * @param description the value for common_user.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column common_user.location
     *
     * @return the value of common_user.location
     *
     * @mbggenerated
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column common_user.location
     *
     * @param location the value for common_user.location
     *
     * @mbggenerated
     */
    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column common_user.head_img
     *
     * @return the value of common_user.head_img
     *
     * @mbggenerated
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column common_user.head_img
     *
     * @param headImg the value for common_user.head_img
     *
     * @mbggenerated
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commonName=").append(commonName);
        sb.append(", gender=").append(gender);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", description=").append(description);
        sb.append(", location=").append(location);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", headImg=").append(headImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
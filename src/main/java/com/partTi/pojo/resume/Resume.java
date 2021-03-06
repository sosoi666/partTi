package com.partTi.pojo.resume;

import com.partTi.pojo.school.School;
import com.partTi.pojo.user.CommonUser;

import java.io.Serializable;
import java.util.Date;

public class Resume implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.id
     *
     * @mbggenerated
     */
    private Integer id;


    private String resumeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.uid
     *
     * @mbggenerated
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.gender
     *
     * @mbggenerated
     */
    private Integer gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.age
     *
     * @mbggenerated
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.pic_src
     *
     * @mbggenerated
     */
    private String picSrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.school
     *
     * @mbggenerated
     */
    private Integer school;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.major
     *
     * @mbggenerated
     */
    private String major;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.exp
     *
     * @mbggenerated
     */
    private String exp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.skill
     *
     * @mbggenerated
     */
    private String skill;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.award
     *
     * @mbggenerated
     */
    private String award;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.self_evaluation
     *
     * @mbggenerated
     */
    private String selfEvaluation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resume
     *
     * @mbggenerated
     */

    private Date createTime;

    private CommonUser commonUser;

    private School mySchool;

    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.id
     *
     * @return the value of resume.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.id
     *
     * @param id the value for resume.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.uid
     *
     * @return the value of resume.uid
     *
     * @mbggenerated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.uid
     *
     * @param uid the value for resume.uid
     *
     * @mbggenerated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.name
     *
     * @return the value of resume.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.name
     *
     * @param name the value for resume.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.gender
     *
     * @return the value of resume.gender
     *
     * @mbggenerated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.gender
     *
     * @param gender the value for resume.gender
     *
     * @mbggenerated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.age
     *
     * @return the value of resume.age
     *
     * @mbggenerated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.age
     *
     * @param age the value for resume.age
     *
     * @mbggenerated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.pic_src
     *
     * @return the value of resume.pic_src
     *
     * @mbggenerated
     */
    public String getPicSrc() {
        return picSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.pic_src
     *
     * @param picSrc the value for resume.pic_src
     *
     * @mbggenerated
     */
    public void setPicSrc(String picSrc) {
        this.picSrc = picSrc == null ? null : picSrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.school
     *
     * @return the value of resume.school
     *
     * @mbggenerated
     */
    public Integer getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.school
     *
     * @param school the value for resume.school
     *
     * @mbggenerated
     */
    public void setSchool(Integer school) {
        this.school = school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.major
     *
     * @return the value of resume.major
     *
     * @mbggenerated
     */
    public String getMajor() {
        return major;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.major
     *
     * @param major the value for resume.major
     *
     * @mbggenerated
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.phone
     *
     * @return the value of resume.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.phone
     *
     * @param phone the value for resume.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.email
     *
     * @return the value of resume.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.email
     *
     * @param email the value for resume.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.exp
     *
     * @return the value of resume.exp
     *
     * @mbggenerated
     */
    public String getExp() {
        return exp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.exp
     *
     * @param exp the value for resume.exp
     *
     * @mbggenerated
     */
    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.skill
     *
     * @return the value of resume.skill
     *
     * @mbggenerated
     */
    public String getSkill() {
        return skill;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.skill
     *
     * @param skill the value for resume.skill
     *
     * @mbggenerated
     */
    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.award
     *
     * @return the value of resume.award
     *
     * @mbggenerated
     */
    public String getAward() {
        return award;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.award
     *
     * @param award the value for resume.award
     *
     * @mbggenerated
     */
    public void setAward(String award) {
        this.award = award == null ? null : award.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.self_evaluation
     *
     * @return the value of resume.self_evaluation
     *
     * @mbggenerated
     */
    public String getSelfEvaluation() {
        return selfEvaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.self_evaluation
     *
     * @param selfEvaluation the value for resume.self_evaluation
     *
     * @mbggenerated
     */
    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation == null ? null : selfEvaluation.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public CommonUser getCommonUser() {
        return commonUser;
    }

    public void setCommonUser(CommonUser commonUser) {
        this.commonUser = commonUser;
    }

    public School getMySchool() {
        return mySchool;
    }

    public void setMySchool(School mySchool) {
        this.mySchool = mySchool;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resume
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", resumeName='" + resumeName + '\'' +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", picSrc='" + picSrc + '\'' +
                ", school=" + school +
                ", major='" + major + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", exp='" + exp + '\'' +
                ", skill='" + skill + '\'' +
                ", award='" + award + '\'' +
                ", selfEvaluation='" + selfEvaluation + '\'' +
                ", createTime=" + createTime +
                ", commonUser=" + commonUser +
                ", mySchool=" + mySchool +
                '}';
    }
}
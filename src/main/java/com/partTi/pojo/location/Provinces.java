package com.partTi.pojo.location;

import java.io.Serializable;
import java.util.List;

public class Provinces implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provinces.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provinces.provinceid
     *
     * @mbggenerated
     */
    private Integer provinceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provinces.province
     *
     * @mbggenerated
     */
    private String province;


    private List<Cities> cities;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table provinces
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provinces.id
     *
     * @return the value of provinces.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provinces.id
     *
     * @param id the value for provinces.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provinces.provinceid
     *
     * @return the value of provinces.provinceid
     *
     * @mbggenerated
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provinces.provinceid
     *
     * @param provinceId the value for provinces.provinceid
     *
     * @mbggenerated
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provinces.province
     *
     * @return the value of provinces.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provinces.province
     *
     * @param province the value for provinces.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public List<Cities> getCities() {
        return cities;
    }

    public void setCities(List<Cities> cities) {
        this.cities = cities;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table provinces
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
        sb.append(", provinceId=").append(provinceId);
        sb.append(", province=").append(province);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
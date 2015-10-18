package com.durga.userReg.bean;



import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import com.durga.common.bean.CityBean;
import com.durga.common.bean.CountryBean;
import com.durga.common.bean.StateBean;

/**
 * @author Rajnish
 * @date 27-09-2015
 */
@Entity
@Table(appliesTo= "user_reg")
public class UserRegBean {

	@Id
	@Column(name = "userid",nullable=false)
	private int userid;
	
	@Column(name= "first_name", nullable=false)
	private String first_name;
	
	@Column(name= "middle_name", nullable=false)
	private String middle_name;
	
	@Column(name= "last_name", nullable=false)
	private String last_name;
	
	@Column(name= "dob", nullable=false)
	private String dob;
	
	@Column(name= "uemail", nullable=false)
	private String uemail;
	
	@Column(name= "umobileno", nullable=false)
	private String umobileno;
	
	@Column(name= "upassword", nullable=false)
	private String upassword;
	
	@Column(name= "uidproof", nullable=false)
	private String uidproof;
	
	@Column(name= "uaddress", nullable=false)
	private String uaddress;
	
	@Column(name= "pincode", nullable=false)
	private int pincode;
	

	private CountryBean countryBean;
	private StateBean stateBean;
	private CityBean cityBean;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobileno() {
		return umobileno;
	}
	public void setUmobileno(String umobileno) {
		this.umobileno = umobileno;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUidproof() {
		return uidproof;
	}
	public void setUidproof(String uidproof) {
		this.uidproof = uidproof;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public CountryBean getCountryBean() {
		return countryBean;
	}
	public void setCountryBean(CountryBean countryBean) {
		this.countryBean = countryBean;
	}
	public StateBean getStateBean() {
		return stateBean;
	}
	public void setStateBean(StateBean stateBean) {
		this.stateBean = stateBean;
	}
	public CityBean getCityBean() {
		return cityBean;
	}
	public void setCityBean(CityBean cityBean) {
		this.cityBean = cityBean;
	}
	
}

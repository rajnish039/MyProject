package com.durga.common.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;




/**
 * @author Rajnish
 * @date 27/09/2015
 */
@Entity
@Table(appliesTo = "city")
public class CityBean {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cityid", nullable = false)
	private int cityid;
	
	@ManyToOne(cascade=CascadeType.ALL,optional = false, targetEntity=StateBean.class)
	@JoinColumn(name = "sateid", referencedColumnName="sateid")
	private StateBean sateid;   // M to 1 with state
	
	public StateBean getSateid() {
		return sateid;
	}
	public void setSateid(StateBean sateid) {
		this.sateid = sateid;
	}
	@Column(name = "city", nullable=false)
	private String city;
	
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}

package com.durga.common.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;



/**
 * @author Rajnish
 * @date 27-09-2015
 */
@Entity
@Table(name="state")
public class StateBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sateid", nullable=false)
    private int stateid;
	
	@ManyToOne(cascade=CascadeType.ALL, optional=false, targetEntity=CountryBean.class)
	@JoinColumn(name="countryid" ,referencedColumnName="countryid")
    private CountryBean countryBean;    // M to 1 with country & 
    
	@Column(name="sname", nullable=false)
	private String sname;
	
	@OneToMany(targetEntity=CityBean.class, mappedBy="stateid", cascade=CascadeType.ALL)
    private List cityList;    // 1 to M with city
    
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public CountryBean getCountryBean() {
		return countryBean;
	}
	public void setCountryBean(CountryBean countryBean) {
		this.countryBean = countryBean;
	}
	public List getCityList() {
		return cityList;
	}
	public void setCityList(List cityList) {
		this.cityList = cityList;
	}
}
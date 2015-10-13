package com.durga.common.bean;

/**
 * @author Rajnish
 * @date 27/09/2015
 */
public class CityBean {
    
	private int cityid;
	private StateBean stateBean;   // M to 1 with state
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

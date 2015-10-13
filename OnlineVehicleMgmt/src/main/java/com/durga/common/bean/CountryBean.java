
package com.durga.common.bean;

import java.util.Set;

/**
 * @author Rajnish
 * @date 27-09-2015
 */
public class CountryBean {
     
	private int countryid;     
	private String cname;
	private Set stateSet;      // 1 to M with state
	
	public CountryBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCountryid() {
		return countryid;
	}
	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set getStateSet() {
		return stateSet;
	}
	public void setStateSet(Set stateSet) {
		this.stateSet = stateSet;
	}
}

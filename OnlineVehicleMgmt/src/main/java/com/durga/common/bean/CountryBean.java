package com.durga.common.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Rajnish
 * @date 27-09-2015
 */
@Entity
@Table(name = "country")
public class CountryBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "countryid", nullable=false)
	private int countryid;
	@Column(name = "cname", nullable=false)
	private String cname;
	@OneToMany(mappedBy = "sateid",cascade=CascadeType.ALL,targetEntity=StateBean.class)
	private Set<StateBean> sateid; // 1 to M with state

	public CountryBean() {
		super();

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

	public Set<StateBean> getSateid() {
		return sateid;
	}

	public void setSateid(Set<StateBean> sateid) {
		this.sateid = sateid;
	}

	

}

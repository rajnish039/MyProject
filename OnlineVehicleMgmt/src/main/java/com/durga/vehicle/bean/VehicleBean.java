package com.durga.vehicle.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.durga.fare.bean.FareBean;
import com.durga.userReg.bean.UserRegBean;
import com.durga.vownerReg.bean.VownerRegBean;

/**
 * @author Rajnish
 * @date 27/09/2015
 */
@Entity
@Table(name = "vehicle")
public class VehicleBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vehicleid", nullable = false)
	private int vehicleid;

	@Column(name = "vtype", nullable = false)
	private String vtype;

	@Column(name = "vmodel", nullable = false)
	private String vmodel;

	@Column(name = "vclass", nullable = false)
	private String vclass;

	@Column(name = "vcapicity", nullable = false)
	private int vcapicity;

	@Column(name = "vehicleno", nullable = false)
	private String vehicleno;

	@Column(name = "vpaperpath", nullable = false)
	private String vpaperpath;

	@Column(name = "vimagepath", nullable = false)
	private String vimagepath;

	private VownerRegBean vownerRegBean; // m to 1 with vowner
	private UserRegBean userRegBean; // m to 1 with user or customer
	
	//here
	@OneToMany(mappedBy = "fareid")
	private FareBean fareBean; // m to m with fare

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getVtype() {
		return vtype;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	public String getVmodel() {
		return vmodel;
	}

	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}

	public String getVclass() {
		return vclass;
	}

	public void setVclass(String vclass) {
		this.vclass = vclass;
	}

	public int getVcapicity() {
		return vcapicity;
	}

	public void setVcapicity(int vcapicity) {
		this.vcapicity = vcapicity;
	}

	public String getVehicleno() {
		return vehicleno;
	}

	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}

	public String getVpaperpath() {
		return vpaperpath;
	}

	public void setVpaperpath(String vpaperpath) {
		this.vpaperpath = vpaperpath;
	}

	public String getVimagepath() {
		return vimagepath;
	}

	public void setVimagepath(String vimagepath) {
		this.vimagepath = vimagepath;
	}

	public VownerRegBean getVownerRegBean() {
		return vownerRegBean;
	}

	public void setVownerRegBean(VownerRegBean vownerRegBean) {
		this.vownerRegBean = vownerRegBean;
	}

	public UserRegBean getUserRegBean() {
		return userRegBean;
	}

	public void setUserRegBean(UserRegBean userRegBean) {
		this.userRegBean = userRegBean;
	}

	public FareBean getFareBean() {
		return fareBean;
	}

	public void setFareBean(FareBean fareBean) {
		this.fareBean = fareBean;
	}

}

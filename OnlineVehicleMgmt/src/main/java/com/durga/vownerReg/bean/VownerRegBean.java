package com.durga.vownerReg.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.durga.common.bean.CityBean;
import com.durga.common.bean.CountryBean;
import com.durga.common.bean.StateBean;
import com.durga.vehicle.bean.VehicleBean;

/**
 * @author Rajnish
 * @date 27/09/2015
 */
@Entity
@Table(name = "veowner")
public class VownerRegBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vowner_id", nullable = false)
	private int vowner_id;

	@Column(name = "vfirst_name", nullable = false)
	private String vfirst_name;

	@Column(name = "vmiddle_name", nullable = false)
	private String vmiddle_name;

	@Column(name = "vlast_name", nullable = false)
	private String vlast_name;

	@Column(name = "vemail", nullable = false)
	private String vemail;

	@Column(name = "vmobileno", nullable = false)
	private String vmobileno;

	@Column(name = "vpassword", nullable = false)
	private String vpassword;

	@Column(name = "vidprooftype", nullable = false)
	private String vidprooftype;

	@Column(name = "vidproofno", nullable = false)
	private String vidproofno;

	@Column(name = "vaddress", nullable = false)
	private String vaddress;

	private CountryBean countryBean;
	private StateBean stateBean;
	private CityBean cityBean;
	
	@Column(name = "vpincode", nullable = false)
	private int vpincode;

	@OneToMany(mappedBy = "vehicleid", cascade = CascadeType.ALL, targetEntity = VehicleBean.class)
	private List vehicleid;

	public int getVowner_id() {
		return vowner_id;
	}

	public void setVowner_id(int vowner_id) {
		this.vowner_id = vowner_id;
	}

	public String getVfirst_name() {
		return vfirst_name;
	}

	public void setVfirst_name(String vfirst_name) {
		this.vfirst_name = vfirst_name;
	}

	public String getVmiddle_name() {
		return vmiddle_name;
	}

	public void setVmiddle_name(String vmiddle_name) {
		this.vmiddle_name = vmiddle_name;
	}

	public String getVlast_name() {
		return vlast_name;
	}

	public void setVlast_name(String vlast_name) {
		this.vlast_name = vlast_name;
	}

	public String getVemail() {
		return vemail;
	}

	public void setVemail(String vemail) {
		this.vemail = vemail;
	}

	public String getVmobileno() {
		return vmobileno;
	}

	public void setVmobileno(String vmobileno) {
		this.vmobileno = vmobileno;
	}

	public String getVpassword() {
		return vpassword;
	}

	public void setVpassword(String vpassword) {
		this.vpassword = vpassword;
	}

	public String getVidprooftype() {
		return vidprooftype;
	}

	public void setVidprooftype(String vidprooftype) {
		this.vidprooftype = vidprooftype;
	}

	public String getVidproofno() {
		return vidproofno;
	}

	public void setVidproofno(String vidproofno) {
		this.vidproofno = vidproofno;
	}

	public String getVaddress() {
		return vaddress;
	}

	public void setVaddress(String vaddress) {
		this.vaddress = vaddress;
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

	public int getVpincode() {
		return vpincode;
	}

	public void setVpincode(int vpincode) {
		this.vpincode = vpincode;
	}

	public List getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(List vehicleid) {
		this.vehicleid = vehicleid;
	}
}
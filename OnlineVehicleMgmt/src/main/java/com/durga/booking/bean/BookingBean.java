package com.durga.booking.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import com.durga.userReg.bean.UserRegBean;
import com.durga.vehicle.bean.VehicleBean;

@Entity
@Table(name = "booking")
public class BookingBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookingid", nullable = false)
	private int bookingid;

	@ManyToOne(cascade=CascadeType.ALL, optional=false, targetEntity=UserRegBean.class)
	@JoinColumn(name="userid" ,referencedColumnName="userid")
	private UserRegBean userRegBean; // here

	@Column(name = "vehicleid", nullable = false)
	private VehicleBean vehicleBean;

	@Column(name = "b_date", nullable = false)
	private String b_date;

	@Column(name = "p_date", nullable = false)
	private String p_date;

	@Column(name = "s_address", nullable = false)
	private String s_address;

	@Column(name = "d_address", nullable = false)
	private String d_address;

	@Column(name = "b_purpose", nullable = false)
	private String b_purpose;

	@Column(name = "distance", nullable = false)
	private String distance;

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public UserRegBean getUserRegBean() {
		return userRegBean;
	}

	public void setUserRegBean(UserRegBean userRegBean) {
		this.userRegBean = userRegBean;
	}

	public VehicleBean getVehicleBean() {
		return vehicleBean;
	}

	public void setVehicleBean(VehicleBean vehicleBean) {
		this.vehicleBean = vehicleBean;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public String getP_date() {
		return p_date;
	}

	public void setP_date(String p_date) {
		this.p_date = p_date;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}

	public String getD_address() {
		return d_address;
	}

	public void setD_address(String d_address) {
		this.d_address = d_address;
	}

	public String getB_purpose() {
		return b_purpose;
	}

	public void setB_purpose(String b_purpose) {
		this.b_purpose = b_purpose;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}
}

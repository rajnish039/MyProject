package com.durga.fare.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.durga.vehicle.bean.VehicleBean;

/**
 * @author Rajnish
 * @date 27-09-2015
 */
@Entity
@Table(name = "fare")
public class FareBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fareid", nullable=false) 
	private int fareid;
	@ManyToMany
    @JoinTable(name="vehicleid")
	private VehicleBean vehicleid;
	
	@Column(name = "fare", nullable=false)
	private Double fare;               //many to many with vehicle
	
	@Column(name = "purpose", nullable=false)
	private String purpose;
	
	public int getFareid() {
		return fareid;
	}
	public void setFareid(int fareid) {
		this.fareid = fareid;
	}
	public VehicleBean getVehicleBean() {
		return vehicleid;
	}
	public void setVehicleBean(VehicleBean vehicleBean) {
		this.vehicleid = vehicleid;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}

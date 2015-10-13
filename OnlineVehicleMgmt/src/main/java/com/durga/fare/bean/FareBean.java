package com.durga.fare.bean;

import com.durga.vehicle.bean.VehicleBean;

/**
 * @author Rajnish
 * @date 27-09-2015
 */
public class FareBean {
    
	private int fareid;
	private VehicleBean vehicleBean;
	private Double fare;               //many to many with vehicle
	private String purpose;
	
	public int getFareid() {
		return fareid;
	}
	public void setFareid(int fareid) {
		this.fareid = fareid;
	}
	public VehicleBean getVehicleBean() {
		return vehicleBean;
	}
	public void setVehicleBean(VehicleBean vehicleBean) {
		this.vehicleBean = vehicleBean;
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

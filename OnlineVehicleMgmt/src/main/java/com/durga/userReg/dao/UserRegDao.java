package com.durga.userReg.dao;

import com.durga.booking.bean.BookingBean;
import com.durga.fare.bean.FareBean;
import com.durga.userReg.bean.UserRegBean;
import com.durga.vehicle.bean.VehicleBean;
import com.durga.vownerReg.bean.VownerRegBean;

public interface UserRegDao {
	
	public int saveUserReg(UserRegBean userRegBean);
	
	public int saveVehicleDetails(VehicleBean vehicleBean);
	
	public int saveBookingDetails(BookingBean bookingBean);
	
	public int saveFareDetails(FareBean fareBean);
	
	public int saveVownerDetails(VownerRegBean vownerRegBean);

}

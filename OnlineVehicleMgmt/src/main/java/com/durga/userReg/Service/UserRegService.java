package com.durga.userReg.Service;

import java.util.List;

import com.durga.booking.bean.BookingBean;
import com.durga.fare.bean.FareBean;
import com.durga.userReg.bean.UserRegBean;
import com.durga.vehicle.bean.VehicleBean;
import com.durga.vownerReg.bean.VownerRegBean;

public interface UserRegService {

public int saveUserReg(UserRegBean userRegBean);
	
	public VehicleBean saveVehicleDetails(VehicleBean vehicleBean);
	
	public List<VehicleBean> getVehicleDetailsByType(String vType);
	
	public List<VehicleBean> getVehicleDetailsByClass(String vClass);
	
	public BookingBean saveBookingDetails(BookingBean bookingBean);
	
	public FareBean saveFareDetails(FareBean fareBean);
	
	public int saveVownerDetails(VownerRegBean vownerRegBean);
}

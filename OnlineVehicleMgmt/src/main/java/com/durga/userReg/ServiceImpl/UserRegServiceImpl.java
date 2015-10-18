/**
 * 
 */
package com.durga.userReg.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.durga.booking.bean.BookingBean;
import com.durga.fare.bean.FareBean;
import com.durga.userReg.Service.UserRegService;
import com.durga.userReg.bean.UserRegBean;
import com.durga.userReg.dao.UserRegDao;
import com.durga.vehicle.bean.VehicleBean;
import com.durga.vownerReg.bean.VownerRegBean;

/**
 * @author Dheeraj
 * @date Oct 18, 2015
 */
public class UserRegServiceImpl implements UserRegService {
	 @Autowired
	UserRegDao userDao;
  
	@Override
	public int saveUserReg(UserRegBean userRegBean) {

		return userDao.saveUserReg(userRegBean);
	}

	@Override
	public VehicleBean saveVehicleDetails(VehicleBean vehicleBean) {

		return userDao.saveVehicleDetails(vehicleBean);
	}

	@Override
	public List<VehicleBean> getVehicleDetailsByType(String vType) {

		return userDao.getVehicleDetailsByType(vType);
	}

	@Override
	public List<VehicleBean> getVehicleDetailsByClass(String vClass) {

		return userDao.getVehicleDetailsByClass(vClass);
	}

	@Override
	public BookingBean saveBookingDetails(BookingBean bookingBean) {

		return userDao.saveBookingDetails(bookingBean);
	}

	@Override
	public FareBean saveFareDetails(FareBean fareBean) {
		return userDao.saveFareDetails(fareBean);
	}

	@Override
	public int saveVownerDetails(VownerRegBean vownerRegBean) {

		return userDao.saveVownerDetails(vownerRegBean);
	}
}

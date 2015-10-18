package com.durga.userReg.daoImpl;

import com.durga.common.bean.CityBean;
import com.durga.common.bean.CountryBean;
import com.durga.common.bean.StateBean;
import com.durga.userReg.bean.UserRegBean;

public class UserRegDaoImplTest {
	
	
	
	
	public static void  main(String rags[]) {
		UserRegBean userRegBean = new UserRegBean();
		userRegBean.setFirst_name("Rajnish");
		userRegBean.setMiddle_name("Pratap");
		userRegBean.setLast_name("Singh");
		userRegBean.setUemail("rajnishprataps32@gmail.com");
		userRegBean.setUmobileno("9452426154");
		userRegBean.setUaddress("Govind Vihar Colony");
		userRegBean.setDob("26/01/1991");
		userRegBean.setUidproof("DLPE526S");
		userRegBean.setPincode(225001);
		userRegBean.setUpassword("081413039");
		
		CityBean cityBean = new CityBean();
		cityBean.setCity("Lucknow");
		
		StateBean stateBean = new StateBean();
		stateBean.setSname("Uttar Pradesh");
		
		CountryBean countryBean = new CountryBean();
		countryBean.setCname("India");
		
		userRegBean.setCityBean(cityBean);
		userRegBean.setStateBean(stateBean);
		userRegBean.setCountryBean(countryBean);
		
		UserRegDaoImpl userReagDao = new UserRegDaoImpl();
		
		int saveStatus = userReagDao.saveUserReg(userRegBean);
		System.out.println(saveStatus+ " Save SuccessFully");
		
		
		
	}

	

}

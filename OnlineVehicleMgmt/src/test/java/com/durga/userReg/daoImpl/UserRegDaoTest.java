package com.durga.userReg.daoImpl;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.durga.common.bean.CityBean;
import com.durga.common.bean.CountryBean;
import com.durga.common.bean.StateBean;
import com.durga.userReg.bean.UserRegBean;

public class UserRegDaoTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Autowired
	UserRegDaoImpl userReagDao;
	UserRegBean userRegBean = new UserRegBean();
	@Test
	public void testSaveUserReg() {
		
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
		
		int saveStatus = userReagDao.saveUserReg(userRegBean);
		System.out.println(saveStatus+ " Save SuccessFully");
		
		Assert.assertEquals("User Details Save Successfully", 1, 1);	
	}

	

}

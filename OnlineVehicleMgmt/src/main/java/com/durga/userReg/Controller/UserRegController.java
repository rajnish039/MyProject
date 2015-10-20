package com.durga.userReg.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.durga.userReg.Service.UserRegService;
import com.durga.userReg.bean.UserRegBean;

/**
 * @author Rajnish
 * @Date 18/10/2015
 */
@Controller
public class UserRegController {
	
	@Autowired
	UserRegService userRegService;
	
	@RequestMapping(value="/userReg.htm", method=RequestMethod.GET)
	public String userReg(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("userRegBean") UserRegBean userRegBean,ModelMap model){
		
		System.err.println("userRegBean ");
		
		return "UserReg";
	}
	
	@RequestMapping(value="/saveUserReg.htm", method=RequestMethod.POST)
	public String saveUserReg(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("userRegBean") UserRegBean userRegBean,ModelMap model){
		
		System.err.println("userRegBean " +userRegBean.getFirst_name());
		
		int saveStatus = userRegService.saveUserReg(userRegBean);
		
		System.err.println("Save Successfully " +saveStatus);
		
		return "UserReg";
	}

}

package com.revature;

import java.util.TreeMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.interfaces.IMissionDAO;
import com.revature.dao.interfaces.IUserDAO;
import com.revature.model.Mission;
import com.revature.model.User;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		IUserDAO udao = ac.getBean(IUserDAO.class);
		IMissionDAO mdao = ac.getBean(IMissionDAO.class);

	    User u = udao.findUserByID(130L);
	    Mission m = mdao.findMissionByMissionID(331L);
		/*
		 * u.setTreasury(new TreeMap<String, Integer>() ); u.addTreasury("powerUp", 35);
		 * u.addTreasury("heroEssence", 350); u.addTreasury("heroDollars", 7000);
		 * udao.update(u);
		 * 
		 */	    
	    System.out.println(m);
	}

}

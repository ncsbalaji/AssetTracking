package com.infotech.DbTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.infotech.hibernatePojo.AssetDetails;
import com.infotech.hibernatePojo.AssetType;
import com.infotech.hibernatePojo.Location;
import com.infotech.hibernatePojo.Role;
import com.infotech.hibernatePojo.User;


public class DbInit{

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring-servlet.xml");
		GetHibernateTemplate gTemplate = (GetHibernateTemplate)factory.getBean("d");
		HibernateTemplate hTemplate=gTemplate.template;	
		//used to initiate database
		
		//creation of roles
		Role role1 = new Role("ADMIN");
		Role role2 = new Role("USER");
		hTemplate.save(role1);
		hTemplate.save(role2);
		
		//adding users
		User user1 = new User(23738, "balaji", "balaji", "ncsbalaji@gmail.com", 1,"oss/bss");
		User user2 = new User(-1, "temp", "temp", "temp@gmail.com", 2,"if no user");
		hTemplate.save(user1);
		hTemplate.save(user2);
		
		//adding locations
		Location loc1 = new Location("Hyd-Madhapur-Phase1-Floor1-Ganga");
		Location loc2 = new Location("Hyd-Madhapur-Phase2-Floor3-Ryen");
		Location loc3 = new Location("Hyd-Gachibowli-Phase1-Floor1-Krishna");
		Location loc4 = new Location("Hyd-Nagarjuna Hills-Phase1-Floor2-Kaveri");
		hTemplate.save(loc1);
		hTemplate.save(loc2);
		hTemplate.save(loc3);
		hTemplate.save(loc4);
		
		//adding asset types
		AssetType assetType1 = new AssetType("Desktop");
		AssetType assetType2 = new AssetType("Laptop");
		hTemplate.save(assetType1);
		hTemplate.save(assetType2);
		
		//adding assetdetails
		AssetDetails assetDetails1 = new AssetDetails(23738,4,1,"172.16.3.41","comp1","model1","12433","54554243","8","500");
		hTemplate.save(assetDetails1);
		
		
	}
	
	

}

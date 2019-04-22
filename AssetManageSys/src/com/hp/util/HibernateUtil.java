package com.hp.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hp.entity.AssetSmallType;
import com.hp.entity.DataBasic;
import com.hp.entity.Role;
import com.hp.entity.User;

public class HibernateUtil {
	private SessionFactory sessionFactory; 
	public  Session getSession(){
		if(sessionFactory==null){
			sessionFactory = new Configuration().configure().buildSessionFactory();
			return sessionFactory.getCurrentSession();
		}else{
			return sessionFactory.getCurrentSession();
		}
	}
	
	
	public void add(DataBasic user,Session session){
		session.save(user);
	}
	public static void main(String[] args) {
		DataBasic db = new DataBasic();
		db.setDevCode(434);
		AssetSmallType at= new AssetSmallType(); 
		at.setId(1);
		db.setAssetSmallType(at);
		db.setDevName("dd");
		
		User user = new User();
		user.setUsername("222");
		user.setPassword("3");
		Role role = new Role();
		role.setId(1);
		user.setRole(role);
		Session session = new HibernateUtil().getSession();
		session.beginTransaction();
		new HibernateUtil().add(db, session);
		session.getTransaction().commit();
	}
}

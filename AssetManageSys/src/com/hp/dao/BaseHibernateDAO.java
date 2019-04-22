package com.hp.dao;

import org.hibernate.Session;

import com.hp.util.HibernateUtil;



/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return new HibernateUtil().getSession();
	}
	
}
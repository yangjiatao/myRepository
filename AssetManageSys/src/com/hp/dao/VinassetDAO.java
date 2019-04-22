package com.hp.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.entity.AssetSmallType;
import com.hp.entity.Vinasset;

/**
 * A data access object (DAO) providing persistence and search support for
 * Vinasset entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hp.entity.Vinasset
 * @author MyEclipse Persistence Tools
 */

public class VinassetDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(VinassetDAO.class);
	// property constants
	public static final String VIN_COST = "vinCost";

	public void save(Vinasset transientInstance) {
		log.debug("saving Vinasset instance");
		try {
			Session session = getSession();
			session.beginTransaction();
			session.save(transientInstance);
			session.getTransaction().commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Vinasset persistentInstance) {
		log.debug("deleting Vinasset instance");
		try {
			Session session = getSession();
			session.beginTransaction();
			session.delete(persistentInstance);
			session.getTransaction().commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Vinasset findById(java.lang.Integer id) {
		log.debug("getting Vinasset instance with id: " + id);
		try {
			Session session = getSession();
			session.beginTransaction();
			Vinasset instance = (Vinasset) session.get(
					"com.hp.entity.Vinasset", id);
			session.getTransaction().commit();
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Vinasset instance) {
		log.debug("finding Vinasset instance by example");
		try {
			List results = getSession()
					.createCriteria("com.hp.entity.Vinasset").add(
							Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Vinasset instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Vinasset as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByVinCost(Object vinCost) {
		return findByProperty(VIN_COST, vinCost);
	}

	public List findAll() {
		log.debug("finding all Vinasset instances");
		try {
			Session session = getSession();
			session.beginTransaction();
			String queryString = "from Vinasset";
			Query queryObject = session.createQuery(queryString);
			List list = queryObject.list();
			session.getTransaction().commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public Integer findDataBasicIDBYVinassetID(Integer id) {
		Iterator<Object> it;
		log.debug("finding Vinasset instance with property: " + id);
		try {
			String queryString = "select dataBasic.devCode from Vinasset where id="
					+ id;
			Session session = getSession();  
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.iterate();				
			if(it.hasNext()){
				Integer vinID = (Integer) it.next();
				tx.commit();
			return vinID;
			}else{
				return 0;
			}
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	
	public String findDataBasicModelByVinassetID(Integer id) {
		Iterator<Object> it;
		log.debug("finding Vinasset instance with property: " + id);
		try {
			String queryString = "select dataBasic.model from Vinasset where id="
					+ id;
			Session session = getSession();  
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.iterate();				
			if(it.hasNext()){
				String model = (String) it.next();
				tx.commit();
			return model;
			}else{
				return null;
			}
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	public Vinasset merge(Vinasset detachedInstance) {
		log.debug("merging Vinasset instance");
		try {
			Session session = getSession();
			session.beginTransaction();
			Vinasset result = (Vinasset) session.merge(detachedInstance);
			session.getTransaction().commit();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Vinasset instance) {
		log.debug("attaching dirty Vinasset instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Vinasset instance) {
		log.debug("attaching clean Vinasset instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
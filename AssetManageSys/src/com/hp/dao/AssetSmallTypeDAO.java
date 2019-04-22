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
import com.hp.entity.DataBasic;

/**
 * A data access object (DAO) providing persistence and search support for
 * AssetSmallType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hp.entity.AssetSmallType
 * @author MyEclipse Persistence Tools
 */

public class AssetSmallTypeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AssetSmallTypeDAO.class);
	// property constants
	public static final String SMALLTYPENAME = "smalltypename";
	
	public void save(AssetSmallType transientInstance) {
		log.debug("saving AssetSmallType instance");
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

	public void delete(AssetSmallType persistentInstance) {
		log.debug("deleting AssetSmallType instance");
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

	public AssetSmallType findById(java.lang.Integer id) {
		log.debug("getting AssetSmallType instance with id: " + id);
		try {
			Session session = getSession();
			Transaction ts  = session.beginTransaction();
			AssetSmallType instance = (AssetSmallType) session.get(
					"com.hp.entity.AssetSmallType", id);
			ts.commit();
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AssetSmallType instance) {
		log.debug("finding AssetSmallType instance by example");
		try {
			List results = getSession().createCriteria(
					"com.hp.entity.AssetSmallType").add(
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
		log.debug("finding AssetSmallType instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AssetSmallType as model where model."
					+ propertyName + "= ?";
			Session session = getSession();
			session.beginTransaction();
			Query queryObject = session.createQuery(queryString);
			queryObject.setParameter(0, value);
			List list = queryObject.list();
			session.getTransaction().commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySmalltypename(Object smalltypename) {
		return findByProperty(SMALLTYPENAME, smalltypename);
	}

	public List findAll() {
		log.debug("finding all AssetSmallType instances");
		try {
			Session session = getSession();  
			Transaction tx = session.beginTransaction(); 
			String queryString = "from AssetSmallType";
			Query queryObject = session.createQuery(queryString);
			List list =  queryObject.list();
			tx.commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public List findHardWareAll() {
		log.debug("finding all AssetSmallType instances");
		try {
			Session session = getSession();  
			Transaction tx = session.beginTransaction(); 
			String queryString = "from AssetSmallType where assetType.id=1";
			Query queryObject = session.createQuery(queryString);
			List list =  queryObject.list();
			tx.commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public List findSoftWareAll() {
		log.debug("finding all AssetSmallType instances");
		try {
			Session session = getSession();  
			Transaction tx = session.beginTransaction(); 
			String queryString = "from AssetSmallType where assetType.id=2";
			Query queryObject = session.createQuery(queryString);
			List list =  queryObject.list();
			tx.commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	

	public AssetSmallType merge(AssetSmallType detachedInstance) {
		log.debug("merging AssetSmallType instance");
		try {
			AssetSmallType result = (AssetSmallType) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AssetSmallType instance) {
		log.debug("attaching dirty AssetSmallType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AssetSmallType instance) {
		log.debug("attaching clean AssetSmallType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public AssetSmallType findBySmalltypeByname(String assetSmallName) {
		Iterator<Object> it;
		log.debug("finding Assettype instance with property: " + assetSmallName);
		try {
			String queryString = "from AssetSmallType where smalltypename="
					+ assetSmallName;
			Session session = getSession();  
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.iterate();				
			if(it.hasNext()){
				AssetSmallType assetSmallType = (AssetSmallType) it.next();
				tx.commit();
			return assetSmallType;
			}else{
				return null;
			}
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
}
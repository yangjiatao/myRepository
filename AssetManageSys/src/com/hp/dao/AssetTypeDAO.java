package com.hp.dao;

import com.hp.entity.AssetType;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * AssetType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hp.entity.AssetType
 * @author MyEclipse Persistence Tools
 */

public class AssetTypeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AssetTypeDAO.class);
	// property constants
	public static final String TYPE_NAME = "typeName";
	
	public void save(AssetType transientInstance) {
		log.debug("saving AssetType instance");
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

	public void delete(AssetType persistentInstance) {
		log.debug("deleting AssetType instance");
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
	
	public AssetType findByAssetTypeName(Object assetTypeName) {
		Iterator<Object> it;
		log.debug("finding Assettype instance with property: " + assetTypeName);
		try {
			String queryString = "from Assettype where assetTypeName='"
					+ assetTypeName + "'";
			Session session = getSession();  
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.iterate();				
			if(it.hasNext()){
				AssetType assettype = (AssetType) it.next();
				tx.commit();
			return assettype;
			}else{
				return null;
			}
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
		
	}

	public AssetType findById(java.lang.Integer id) {
		log.debug("getting AssetType instance with id: " + id);
		try {
			Session session = getSession();
			Transaction ts  = session.beginTransaction();
			AssetType instance = (AssetType) session.get(
					"com.hp.entity.AssetType", id);
			ts.commit();
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AssetType instance) {
		log.debug("finding AssetType instance by example");
		try {
			Session session = getSession();
			List results = session.createCriteria(
					"com.hp.entity.AssetType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding AssetType instance with property: " + propertyName
				+ ", value: " + value);
		try {
			Session session = getSession();
			String queryString = "from AssetType as model where model."
					+ propertyName + "= ?";
			Query queryObject = session.createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTypeName(Object typeName) {
		return findByProperty(TYPE_NAME, typeName);
	}

	public List findAll() {
		log.debug("finding all AssetType instances");
		try {
			Session session = getSession();
			String queryString = "from AssetType";
			session.beginTransaction();
			Query queryObject = session.createQuery(queryString);
			List list = queryObject.list();
			session.getTransaction().commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AssetType merge(AssetType detachedInstance) {
		log.debug("merging AssetType instance");
		try {
			Session session = getSession();
			AssetType result = (AssetType) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AssetType instance) {
		log.debug("attaching dirty AssetType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AssetType instance) {
		log.debug("attaching clean AssetType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
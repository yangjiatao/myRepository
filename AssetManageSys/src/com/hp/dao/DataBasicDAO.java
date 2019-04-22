package com.hp.dao;

import com.hp.entity.DataBasic;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * DataBasic entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hp.entity.DataBasic
 * @author MyEclipse Persistence Tools
 */

public class DataBasicDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(DataBasicDAO.class);
	// property constants
	public static final String DEV_NAME = "devName";
	public static final String BRAND = "brand";
	public static final String MODEL = "model";
	public static final String FAC = "fac";
	public static final String ACC = "acc";
	public static final String PRICE = "price";
	public static final String QUANTITY = "quantity";
	public static final String DEPARTMENT = "department";
	
	public void save(DataBasic transientInstance) {
		log.debug("saving DataBasic instance");
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

	public void delete(DataBasic persistentInstance) {
		log.debug("deleting DataBasic instance");
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

	public DataBasic findById(java.lang.Integer id) {
		log.debug("getting DataBasic instance with id: " + id);
		try {
			Session session = getSession();
			DataBasic instance = (DataBasic) session.get(
					"com.hp.entity.DataBasic", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	public DataBasic findByDataBasicDevCode(int devCode) {
		Iterator<Object> it;
		log.debug("finding Assettype instance with property: " + devCode);
		try {
			String queryString = "from DataBasic where devCode="
					+ devCode;
			Session session = getSession();  
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.iterate();				
			if(it.hasNext()){
				DataBasic dataBasic = (DataBasic) it.next();
				tx.commit();
			return dataBasic;
			}else{
				return null;
			}
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	public DataBasic findByDataBasicModel(String model) {
		Iterator<Object> it;
		log.debug("finding Assettype instance with property: " + model);
		try {
			String queryString = "from DataBasic where model='"
					+ model+"'";
			Session session = getSession();  
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.iterate();				
			if(it.hasNext()){
				DataBasic dataBasic = (DataBasic) it.next();
				tx.commit();
			return dataBasic;
			}else{
				return null;
			}
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	public List<DataBasic> findHardWareAll() {
		log.debug("finding all DataBasic instances");
		try {
			Session session = getSession();  
			String queryString = "from DataBasic where assetSmallType.assetType.id=1";
			session.beginTransaction();
			Query queryObject = session.createQuery(queryString);
			List<DataBasic> list = queryObject.list();
			session.getTransaction().commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public List<DataBasic> findSoftWareAll() {
		log.debug("finding all DataBasic instances");
		try {
			Session session = getSession();  
			String queryString = "from DataBasic where assetSmallType.assetType.id=2";
			session.beginTransaction();
			Query queryObject = session.createQuery(queryString);
			List<DataBasic> list = queryObject.list();
			session.getTransaction().commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public List findByExample(DataBasic instance) {
		log.debug("finding DataBasic instance by example");
		try {
			List results = getSession().createCriteria(
					"com.hp.entity.DataBasic").add(Example.create(instance))
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
		log.debug("finding DataBasic instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DataBasic as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDevName(Object devName) {
		return findByProperty(DEV_NAME, devName);
	}

	public List findByBrand(Object brand) {
		return findByProperty(BRAND, brand);
	}

	public List findByModel(Object model) {
		return findByProperty(MODEL, model);
	}

	public List findByFac(Object fac) {
		return findByProperty(FAC, fac);
	}

	public List findByAcc(Object acc) {
		return findByProperty(ACC, acc);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByQuantity(Object quantity) {
		return findByProperty(QUANTITY, quantity);
	}

	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	public List<DataBasic> findAll() {
		log.debug("finding all DataBasic instances");
		try {
			Session session = getSession();  
			session.beginTransaction();
			String queryString = "from DataBasic";
			Transaction ts = session.getTransaction();
			Query queryObject = session.createQuery(queryString);
			List list = queryObject.list();
			ts.commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DataBasic merge(DataBasic detachedInstance) {
		log.debug("merging DataBasic instance");
		try {
			Session session = getSession();  
			session.beginTransaction();
			DataBasic result = (DataBasic) session.merge(detachedInstance);
			log.debug("merge successful");
			session.getTransaction().commit();
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DataBasic instance) {
		log.debug("attaching dirty DataBasic instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DataBasic instance) {
		log.debug("attaching clean DataBasic instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
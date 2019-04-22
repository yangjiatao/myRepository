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

import com.hp.entity.Role;
import com.hp.entity.User;

/**
 * A data access object (DAO) providing persistence and search support for Role
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.hp.entity.Role
 * @author MyEclipse Persistence Tools
 */

public class RoleDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(RoleDAO.class);
	// property constants
	public static final String ROLENAME = "rolename";
	
	public void save(Role transientInstance) {
		log.debug("saving Role instance");
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

	public void delete(Role persistentInstance) {
		log.debug("deleting Role instance");
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
	
	public Role findRoleByRoleName(String rolename) {
		Session session = getSession();  
		Iterator<Role> it;
		log.debug("finding Role instance with property: " + rolename);
		try {
			String queryString = "from Role where rolename='"
					+ rolename+"'";
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.iterate();				
			if(it.hasNext()){
				Role role = (Role) it.next();
				tx.commit();
			return role;
			}else{
				return null;
			}
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	public Role findById(java.lang.Integer id) {
		log.debug("getting User instance with id: " + id);
		try {
			Session session = getSession();
			session.beginTransaction();
			Role instance = (Role) session.get("com.hp.entity.Role", id);
			session.getTransaction().commit();
			return instance;
		}catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	public List findByExample(Role instance) {
		log.debug("finding Role instance by example");
		try {
			List results = getSession().createCriteria("com.hp.entity.Role")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Role instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Role as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRolename(Object rolename) {
		return findByProperty(ROLENAME, rolename);
	}

	public List<Role> findAll() {
		log.debug("finding all Role instances");
		try {
			Session session = getSession();
			session.beginTransaction();
			String queryString = "from Role";
			Query queryObject = session.createQuery(queryString);
			List list = queryObject.list();
			session.getTransaction().commit();
			
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Role merge(Role detachedInstance) {
		log.debug("merging Role instance");
		try {
			Session session = getSession();
			session.beginTransaction();
			Role result = (Role) session.merge(detachedInstance);
			session.getTransaction().commit();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Role instance) {
		log.debug("attaching dirty Role instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Role instance) {
		log.debug("attaching clean Role instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public int findRoleIdByUserId(int userId) {
		Session session = getSession();  
		Iterator<Integer> it;
		log.debug("finding Role instance with property: " + userId);
		try {
			String queryString = "select role.id from User where id="
					+ userId;
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.iterate();				
			if(it.hasNext()){
				Integer roleId = (Integer) it.next();
				tx.commit();
			return roleId;
			}else{
				return 0;
			}
		}catch (RuntimeException re) {
				log.error("attach failed", re);
				throw re;
			}
		}

	public boolean findRoleIdWhereNotInUser(Integer id) {
		Session session = getSession();  
		List<Integer> it;
		log.debug("finding Role instance with property: " + id);
		try {
			String queryString = "select r.id from Role r where r.id not in(select r.id from User u join u.role r where u.role.id = r.id)";
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.list();				
			if(it.contains(id)){
				tx.commit();
				return false;
			}else{
				return true;
			}
		}catch (RuntimeException re) {
				log.error("attach failed", re);
				throw re;
			}
	}
	
}

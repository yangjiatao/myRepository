package com.hp.dao;

import com.hp.entity.DataBasic;
import com.hp.entity.User;

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
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.hp.entity.User
 * @author MyEclipse Persistence Tools
 */

public class UserDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(UserDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String AGE = "age";
	public static final String EMAIL = "email";
	public static final String PHONE = "phone";
	
	public void save(User transientInstance) {
		Session session = getSession();
		log.debug("saving User instance");
		try {
			session.beginTransaction();
			session.save(transientInstance);
			session.getTransaction().commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}

	}

	public void delete(User persistentInstance) {
		Session session = getSession();
		log.debug("deleting User instance");
		try {
			session.beginTransaction();
			session.delete(persistentInstance);
			session.getTransaction().commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
//		finally{
//			if(session != null)
//				System.out.println("关闭session");
//				session.close();
//		}
	}

	public User findById(java.lang.Integer id) {
		Session session = getSession();
		log.debug("getting User instance with id: " + id);
		try {
			session.beginTransaction();
			User instance = (User) session.get("com.hp.entity.User", id);
			session.getTransaction().commit();
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
//		finally{
//			if(session != null)
//				System.out.println("关闭session");
//				session.close();
//		}
	}
	
	public User findUserByUsername(String username) {
		Session session = getSession();  
		Iterator<User> it;
		log.debug("finding User instance with property: " + username);
		try {
			String queryString = "from User where username='"
					+ username+"'";
			Transaction tx = session.beginTransaction(); 
			Query queryObject = session.createQuery(queryString);
			 it = queryObject.iterate();				
			if(it.hasNext()){
				User user = (User) it.next();
				tx.commit();
			return user;
			}else{
				return null;
			}
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
//		finally{
//			if(session != null)
//				System.out.println("关闭session");
//				session.close();
//		}
	}
	public List findByExample(User instance) {
		log.debug("finding User instance by example");
		try {
			Session session = getSession();
			List results = session.createCriteria("com.hp.entity.User")
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
		Session session = getSession();
		
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			Query queryObject = session.createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
//		finally{
//			if(session != null)
//				System.out.println("关闭session");
//				session.close();
//		}
	}

	public List findByUsername(String username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}
	public List findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public boolean checkLogin(String username,String password){
		log.debug("finding User instance with property: " + username
				+ ", value: " + password);
		try {
			String queryString = "from User where username=? and password=?";
			System.out.println(queryString);
			Session session = getSession();
			session.beginTransaction();
			Query queryObject = session.createQuery(queryString);
			queryObject.setParameter(0, username);
			queryObject.setParameter(1, password);
			Iterator<User> it = queryObject.iterate();
			if(it.hasNext()) {
			session.getTransaction().commit();
			return true;
			}
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
		
		return false;
	}
	public void updateUser(User user){
		Session session = getSession();
		log.debug("merging User instance");
		try{
		Transaction trans=session.beginTransaction();
		String hql="update User user set user.age=?,user.password=?,user.email=?,user.phone=? where user.id=?";
		Query queryupdate=session.createQuery(hql);
		queryupdate.setParameter(0, user.getAge());
		queryupdate.setParameter(1, user.getPassword());
		queryupdate.setParameter(2, user.getEmail());
		queryupdate.setParameter(3, user.getPhone());
		queryupdate.setParameter(4, user.getId());
		queryupdate.executeUpdate();
		session.update(user);
		trans.commit();
		}catch(RuntimeException re) {
		log.error("merge failed", re);
			throw re;
		}
//		finally{
//			if(session != null)
//				System.out.println("关闭session");
//				session.close();
//		}
	}

	public List<User> findAll() {
		Session session = getSession();
		log.debug("finding all User instances");
		try {
			
			session.beginTransaction();
			String queryString = "from User";
			Query queryObject = session.createQuery(queryString);
			List list = queryObject.list();
			session.getTransaction().commit();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
//		finally{
//			if(session != null)
//				System.out.println("关闭session");
//				session.close();
//		}
	}

	public User merge(User detachedInstance) {
		log.debug("merging User instance");
		try {
			Session session = getSession();
			session.beginTransaction();
			User result = (User) session.merge(detachedInstance);
			session.getTransaction().commit();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

//	public void merge(User user){
//		log.debug("merging User instance");
//		try{
//		Session session = getSession();
//		Transaction trans=session.beginTransaction();
////		String hql="update User user set user.age=?,user.password=?,user.email=?,user.phone=? where user.id=?";
////		Query queryupdate=session.createQuery(hql);
////		int ret=queryupdate.executeUpdate();
//		session.update(user);
//		trans.commit();
//		}catch(RuntimeException re) {
//		log.error("merge failed", re);
//			throw re;
//		}
//	}
	public void attachDirty(User instance) {
		log.debug("attaching dirty User instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(User instance) {
		log.debug("attaching clean User instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
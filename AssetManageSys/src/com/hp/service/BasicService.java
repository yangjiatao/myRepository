package com.hp.service;


import com.hp.dao.AssetSmallTypeDAO;
import com.hp.dao.AssetTypeDAO;
import com.hp.dao.DataBasicDAO;
import com.hp.dao.RoleDAO;
import com.hp.dao.UserDAO;
import com.hp.dao.VinassetDAO;

public class BasicService {
	private DataBasicDAO databasicDao = new DataBasicDAO();
	private RoleDAO roleDao = new RoleDAO();
	private UserDAO userDao = new UserDAO();
	private AssetTypeDAO assetTypeDao = new AssetTypeDAO();
	private AssetSmallTypeDAO assetSmallTypeDao = new AssetSmallTypeDAO();
	private VinassetDAO vinassetDao = new VinassetDAO();
	
	public VinassetDAO getVinassetDao() {
		return vinassetDao;
	}

	public void setVinassetDao(VinassetDAO vinassetDao) {
		this.vinassetDao = vinassetDao;
	}

	public DataBasicDAO getDatabasicDao() {
		return databasicDao;
	}

	public void setDatabasicDao(DataBasicDAO databasicDao) {
		this.databasicDao = databasicDao;
	}

	
	public RoleDAO getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDAO roleDao) {
		this.roleDao = roleDao;
	}

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public AssetTypeDAO getAssetTypeDao() {
		return assetTypeDao;
	}

	public void setAssetTypeDao(AssetTypeDAO assetTypeDao) {
		this.assetTypeDao = assetTypeDao;
	}

	public AssetSmallTypeDAO getAssetSmallTypeDao() {
		return assetSmallTypeDao;
	}

	public void setAssetSmallTypeDao(AssetSmallTypeDAO assetSmallTypeDao) {
		this.assetSmallTypeDao = assetSmallTypeDao;
	}

}

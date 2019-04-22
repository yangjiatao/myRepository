package com.hp.service;

import java.util.List;

import com.hp.entity.Vinasset;

public class VinassetServiceImpl extends BasicService implements VinassetService {

	public List<Vinasset> findFixedListAll() {
		// TODO Auto-generated method stub
		return getVinassetDao().findAll();
	}

	public Vinasset findFixedByID(Integer id) {
		return getVinassetDao().findById(id);
	}

	public Integer findDataBasicIDBYVinassetID(Integer id) {
		return getVinassetDao().findDataBasicIDBYVinassetID(id);
	}

	public String findDataBasicModelByVinassetID(Integer id) {
		// TODO Auto-generated method stub
		return getVinassetDao().findDataBasicModelByVinassetID(id);
	}

	public void addVinasset(Vinasset transientInstance) {
		 getVinassetDao().save(transientInstance);
	}

	public void delete(Vinasset vinasset) {
		getVinassetDao().delete(vinasset);
	}

	public Vinasset modifyVinasset(Vinasset vinasset) {
		return getVinassetDao().merge(vinasset);
	}

}

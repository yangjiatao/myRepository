package com.hp.service;

import java.util.List;

import com.hp.entity.Vinasset;

public interface VinassetService {

	List<Vinasset> findFixedListAll();

	Vinasset findFixedByID(Integer id);
	
	public Integer findDataBasicIDBYVinassetID(Integer id);

	public String findDataBasicModelByVinassetID(Integer id);

	public void addVinasset(Vinasset transientInstance);

	public void delete(Vinasset findFixedByID);

	public Vinasset modifyVinasset(Vinasset vinasset);
	
}

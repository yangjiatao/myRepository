package com.hp.service;

import java.util.List;

import com.hp.entity.AssetSmallType;

public class AssetSmallTypeServiceImpl extends BasicService implements AssetSmallTypeService {

	public List AssetHardSmallTypeListAll() {
		return getAssetSmallTypeDao().findHardWareAll();
	}
	
	public List AssetSoftSmallTypeListAll() {
		return getAssetSmallTypeDao().findSoftWareAll();
	}

	public List AssetSmallTypeListAll() {
		return getAssetSmallTypeDao().findAll();
	}

	public List<AssetSmallType> AssetSmallTypeListAllByBigTypeID(Integer id) {
		return getAssetSmallTypeDao().findByProperty("assetType.id", id);
	}

	

}

package com.hp.service;

import java.util.List;

import com.hp.entity.AssetSmallType;

public interface AssetSmallTypeService {
	public List AssetHardSmallTypeListAll();
	public List AssetSoftSmallTypeListAll();
	public List AssetSmallTypeListAll();
	public List<AssetSmallType> AssetSmallTypeListAllByBigTypeID(Integer id);
	
}

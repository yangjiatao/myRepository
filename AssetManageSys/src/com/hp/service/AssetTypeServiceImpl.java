package com.hp.service;

import java.util.List;

public class AssetTypeServiceImpl extends BasicService implements AssetTypeService {

	public List AssetTypeListAll() {
		return getAssetTypeDao().findAll();
	}

}

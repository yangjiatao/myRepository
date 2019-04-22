package com.hp.service;

import java.util.List;

import com.hp.entity.AssetSmallType;
import com.hp.entity.AssetType;
import com.hp.entity.DataBasic;



public interface DataBasicService {
	public void addAsset(DataBasic databasic);
	public void addHardWare(DataBasic databasic);
	public void addSoftWare(DataBasic databasic);
	public List<DataBasic> AssetListAll();
	public List<DataBasic> SoftWareListAll();
	public List<DataBasic> HardWareListAll();
	public void deleteAsset(DataBasic databasic);
	public void deleteHardWare(DataBasic databasic);
	public void deleteSoftWare(DataBasic databasic);
	public void modifyHaredWare(DataBasic detachedInstance);
	public void modifySoftWare(DataBasic detachedInstance);
	public DataBasic findByDataBasicDevCode(java.lang.Integer id);
	public AssetSmallType findAssetSmallTypeById(int iD);
	public AssetSmallType findAssetSmallTypeByName(String assetSmallName);
	public AssetType findAssetTypeById(Integer id);
	public DataBasic findByDataBasicModel(String findDataBasicModelByVinassetID);
	public void ModifyAsset(DataBasic databasic);
	
}

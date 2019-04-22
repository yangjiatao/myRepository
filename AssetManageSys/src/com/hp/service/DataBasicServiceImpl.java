package com.hp.service;

import java.util.List;

import com.hp.entity.AssetSmallType;
import com.hp.entity.AssetType;
import com.hp.entity.DataBasic;

public class DataBasicServiceImpl extends BasicService implements DataBasicService{
	

	public void addAsset(DataBasic databasic) {
		// TODO Auto-generated method stub
		getDatabasicDao().save(databasic);
	}

	public void addHardWare(DataBasic databasic) {
		getDatabasicDao().save(databasic);
		
	}

	public void addSoftWare(DataBasic databasic) {
		getDatabasicDao().save(databasic);
		
	}

	public List<DataBasic> AssetListAll() {
		return getDatabasicDao().findAll();
		
	}

	

	public List<DataBasic> SoftWareListAll() {
		return getDatabasicDao().findSoftWareAll();		
	}
	public List<DataBasic> HardWareListAll(){
		return getDatabasicDao().findHardWareAll();
	}
	public void deleteAsset(DataBasic databasic) {
		getDatabasicDao().delete(databasic);
	}

	public void deleteHardWare(DataBasic databasic) {
		getDatabasicDao().delete(databasic);
		// TODO Auto-generated method stub
		
	}

	public void deleteSoftWare(DataBasic databasic) {
		getDatabasicDao().delete(databasic);
		
	}

	

	public void modifyHaredWare(DataBasic detachedInstance) {
		 getDatabasicDao().merge(detachedInstance);
		
	}

	public void modifySoftWare(DataBasic detachedInstance) {
		getDatabasicDao().merge(detachedInstance);
		
	}


	public DataBasic findByDataBasicDevCode(Integer devCode) {
		return getDatabasicDao().findByDataBasicDevCode(devCode);
	}

	public AssetSmallType findAssetSmallTypeById(int id) {
			return getAssetSmallTypeDao().findById(id);
	}

	public AssetSmallType findAssetSmallTypeByName(String assetSmallName) {
			return getAssetSmallTypeDao().findBySmalltypeByname(assetSmallName);
	}

	public AssetType findAssetTypeById(Integer id) {
			return getAssetTypeDao().findById(id);
	}

	public DataBasic findByDataBasicModel(String findDataBasicModelByVinassetID) {
		// TODO Auto-generated method stub
		return getDatabasicDao().findByDataBasicModel(findDataBasicModelByVinassetID);
	}

	public void ModifyAsset(DataBasic databasic) {
		 getDatabasicDao().merge(databasic);
	}

	

}

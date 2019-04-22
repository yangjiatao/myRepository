package com.hp.action;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.hp.entity.AssetSmallType;
import com.hp.entity.AssetType;
import com.hp.entity.DataBasic;
import com.hp.entity.Vinasset;
import com.hp.util.DataChangeUtil;
import com.opensymphony.xwork2.ActionContext;

	public class AssetAction extends BaseAction {
		
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	public static final String GLOBAL_ASSETTYPE="global_assettype_list";//大类别列表
	public static final String GLOBAL_ASSETSMALLTYPE="global_double_list";//小类别列表
	Map doubleMap = new HashMap();
	private DataBasic databasic;
	private int devCode;
	private AssetSmallType assettype = new AssetSmallType();
	private String assetSmallTypeName;
	private AssetSmallType assetSmallType;
	private List<AssetSmallType> AssetSmallTypeListAll;
	private String smalltypename;
	private List<AssetType> AssetTypeListAll;
	private String typename;
	private AssetType assetType;
	private int ID;
	private List<DataBasic> dataBasicList;
	private String message;
	private Vinasset vinasset;
	private List<Vinasset> vinassetList;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String addFixedAssetsPre() {
		AssetSmallTypeListAll = assetSmallTypeService.AssetSmallTypeListAll();
		return SUCCESS;
	}
	public String addFixedAssets(){
		
		if(databasicService.findByDataBasicDevCode(databasic.getDevCode())== null){
		message = "对不起，不存在此设备编码";
		
		return INPUT;
	}
		vinasset.setDataBasic(databasicService.findByDataBasicDevCode(databasic.getDevCode()));
		databasic.setDate(new DataChangeUtil().dateTimeChange(databasic.getDate()));
		vinassetService.addVinasset(vinasset);
		return SUCCESS;
	}
	
	
	
	
	
	public String addAssetPre() {
		AssetTypeListAll = (List<AssetType>) ActionContext.getContext().getSession().get(
				GLOBAL_ASSETTYPE);

			if (AssetTypeListAll == null) {
				AssetTypeListAll = assetTypeService.AssetTypeListAll();
			    ActionContext.getContext().getSession().put(GLOBAL_ASSETTYPE,
			    		AssetTypeListAll);

			}

			for (int i = 0; i < AssetTypeListAll.size(); i++) {

			    List<AssetSmallType> assetSmallType = assetSmallTypeService.AssetSmallTypeListAllByBigTypeID(AssetTypeListAll.get(i).getId());

			    List c = new LinkedList();
			    for (int j = 0; j < assetSmallType.size(); j++) {

				c.add(assetSmallType.get(j));
			    }
			    doubleMap.put(AssetTypeListAll.get(i), c);
			}
		return SUCCESS;
	}
	
	public String AddAsset() {  
		AssetTypeListAll = assetTypeService.AssetTypeListAll();
		
		for (int i = 0; i < AssetTypeListAll.size(); i++) {

		    List<AssetSmallType> assetSmallType = assetSmallTypeService.AssetSmallTypeListAllByBigTypeID(AssetTypeListAll.get(i).getId());

		    List c = new LinkedList();
		    for (int j = 0; j < assetSmallType.size(); j++) {

			c.add(assetSmallType.get(j));
		    }
		    doubleMap.put(AssetTypeListAll.get(i), c);
		}
		
		
		
		
		assetType = databasicService.findAssetTypeById(assetType.getId());
		assetSmallType = databasicService.findAssetSmallTypeById(assetSmallType.getId());
		databasic.setAssetSmallType(assetSmallType);
		assetType = databasicService.findAssetTypeById(assetType.getId());
		databasic.setAssetType(assetType);
		if(databasicService.findByDataBasicDevCode(databasic.getDevCode())!= null){
		message = "设备编码不能相同";
			
			return INPUT;
		}
		databasic.setDate(new DataChangeUtil().dateTimeChange(databasic.getDate()));
		databasicService.addAsset(databasic);
		return SUCCESS;
	}
	
	public String addHardWarePre() {
		System.out.println("aaaaaaaaaaaaa");
		AssetSmallTypeListAll = assetSmallTypeService.AssetHardSmallTypeListAll();
		getSession().put("AssetSmallTypeListAll", AssetSmallTypeListAll);
		return SUCCESS;
	}
	public String addHardWare() {
		AssetSmallTypeListAll = assetSmallTypeService.AssetHardSmallTypeListAll();
		assetSmallType = databasicService.findAssetSmallTypeById(assetSmallType.getId());
		databasic.setAssetSmallType(assetSmallType);
		System.out.println("sssss");
		if(databasicService.findByDataBasicDevCode(databasic.getDevCode())!= null){
		message = "设备编码不能相同";
			
			return INPUT;
		}
		databasic.setDate(new DataChangeUtil().dateTimeChange(databasic.getDate()));
		databasicService.addHardWare(databasic);
		return SUCCESS;
	}
	
	public String addSoftWarePre() {
		System.out.println("aaaaaaaaaaaaa");
		AssetSmallTypeListAll = assetSmallTypeService.AssetSoftSmallTypeListAll();
		getSession().put("AssetSmallTypeListAll", AssetSmallTypeListAll);
		return SUCCESS;
	}
	public String addSoftWare() {
		AssetSmallTypeListAll = assetSmallTypeService.AssetHardSmallTypeListAll();
		assetSmallType = databasicService.findAssetSmallTypeById(assetSmallType.getId());
		databasic.setAssetSmallType(assetSmallType);
		System.out.println("sssss");
		if(databasicService.findByDataBasicDevCode(databasic.getDevCode())!= null){
		message = "设备编码不能相同";
			
			return INPUT;
	}
		databasic.setDate(new DataChangeUtil().dateTimeChange(databasic.getDate()));
		databasicService.addSoftWare(databasic);
		return SUCCESS;
	}	
	
	public String AssetListAll() {
		dataBasicList = databasicService.AssetListAll();
		for(int i=0;i<dataBasicList.size();i++) {
			//typename = dataBasicList.get(i).getAssetType().getTypeName();		
		}
		getSession().put("dataBasicList", dataBasicList);
		return SUCCESS;
	}
	
	public String SoftWareListAll() {
		dataBasicList = databasicService.SoftWareListAll();
		for(int i=0;i<dataBasicList.size();i++) {
			assetSmallTypeName = dataBasicList.get(i).getAssetSmallType().getSmalltypename();		
		}
		getSession().put("dataBasicList", dataBasicList);
		return SUCCESS;
	}
	
	public String HardWareListAll() {
		dataBasicList = databasicService.HardWareListAll();
		for(int i=0;i<dataBasicList.size();i++) {
			assetSmallTypeName = dataBasicList.get(i).getAssetSmallType().getSmalltypename();		
		}
		getSession().put("dataBasicList", dataBasicList);
		return SUCCESS;
	}
	
	public String FixedAssetsListAll() {
		vinassetList = vinassetService.findFixedListAll();
		dataBasicList = databasicService.AssetListAll();
		for(int i=0;i<vinassetList.size();i++){
			databasic = databasicService.findByDataBasicDevCode(vinassetService.findDataBasicIDBYVinassetID(vinassetList.get(i).getId()));
			//databasic = databasicService.findByDataBasicDevCode(databasic.getDevCode());
			vinassetList.get(i).setDataBasic(databasic);
			
		}
		
		getSession().put("vinassetList", vinassetList);
		return SUCCESS;
	}
	
	public String deleteAsset() {
		databasic = databasicService.findByDataBasicDevCode(devCode);
		databasicService.deleteAsset(databasic);
		return SUCCESS;
	}
	
	public String deleteHardWare() {
		databasic = databasicService.findByDataBasicDevCode(devCode);
		databasicService.deleteHardWare(databasic);
		return SUCCESS;
	}
	
	public String deleteSoftWare() {
		databasic = databasicService.findByDataBasicDevCode(devCode);
		databasicService.deleteSoftWare(databasic);
		return SUCCESS;
	}
	public String deleteFixedAssets() {
		vinassetService.delete(vinassetService.findFixedByID(vinasset.getId()));
		return SUCCESS;
	}
	
	public String modifyFixedAssetsPre() {
		vinasset = vinassetService.findFixedByID(vinasset.getId());
		return SUCCESS;
	}
	
	public String modifyFixedAssets() {
		databasic = databasicService.findByDataBasicDevCode(vinasset.getDataBasic().getDevCode());
		System.out.println(databasic);
		vinasset.setDataBasic(databasic);
		databasic.setDate(new DataChangeUtil().dateTimeChange(databasic.getDate()));
		vinassetService.modifyVinasset(vinasset);
		return SUCCESS;
	}
	public String modifyAssetPre() {
		databasic = databasicService.findByDataBasicDevCode(devCode);
		AssetTypeListAll = assetTypeService.AssetTypeListAll();
		
		for (int i = 0; i < AssetTypeListAll.size(); i++) {

		    List<AssetSmallType> assetSmallType = assetSmallTypeService.AssetSmallTypeListAllByBigTypeID(AssetTypeListAll.get(i).getId());

		    List c = new LinkedList();
		    for (int j = 0; j < assetSmallType.size(); j++) {

			c.add(assetSmallType.get(j));
		    }
		    doubleMap.put(AssetTypeListAll.get(i), c);
		}
		return SUCCESS;
	}
	public String modifyAsset() {
		assetSmallType = databasicService.findAssetSmallTypeById(assetSmallType.getId());
		databasic.setAssetSmallType(assetSmallType);
		databasic.setDate(new DataChangeUtil().dateTimeChange(databasic.getDate()));
		databasicService.ModifyAsset(databasic);
		return SUCCESS;
	}
	public String modifySoftWarePre() {
		AssetSmallTypeListAll = assetSmallTypeService.AssetSoftSmallTypeListAll();
		
		databasic = databasicService.findByDataBasicDevCode(devCode);
		System.out.println(databasic.getDevCode()+"aaaaaaaaaaaaaaaaaaa");
		getSession().put("dataBasic", databasic);
		return SUCCESS;
	}
	public String modifySoftWare() {
		System.out.println(assetSmallType.getId()+"ff");
		assetSmallType = databasicService.findAssetSmallTypeById(assetSmallType.getId());
		databasic.setAssetSmallType(assetSmallType);
		System.out.println(databasic.getDevCode()+"ssssssss");
		databasic.setDate(new DataChangeUtil().dateTimeChange(databasic.getDate()));
		databasicService.modifySoftWare(databasic);
		return SUCCESS;
	}
	public String modifyHardWarePre() {
		AssetSmallTypeListAll = assetSmallTypeService.AssetHardSmallTypeListAll();
		
		databasic = databasicService.findByDataBasicDevCode(devCode);
		System.out.println(databasic.getDevCode()+"aaaaaaaaaaaaaaaaaaa");
		getSession().put("dataBasic", databasic);
		return SUCCESS;
	}
	public String modifyHardWare() {
		System.out.println(assetSmallType.getId()+"ff");
		assetSmallType = databasicService.findAssetSmallTypeById(assetSmallType.getId());
		databasic.setAssetSmallType(assetSmallType);
		System.out.println(databasic.getDevCode()+"ssssssss");
		databasic.setDate(new DataChangeUtil().dateTimeChange(databasic.getDate()));
		databasicService.modifyHaredWare(databasic);
		return SUCCESS;
	}
	
	public DataBasic getDatabasic() {
		return databasic;
	}

	public void setDatabasic(DataBasic databasic) {
			this.databasic = databasic;
		}


	public AssetSmallType getAssettype() {
		return assettype;
	}

	public void setAssettype(AssetSmallType assettype) {
		this.assettype = assettype;
	}


	public List<DataBasic> getDataBasicList() {
		return dataBasicList;
	}

	public void setDataBasicList(List<DataBasic> dataBasicList) {
		this.dataBasicList = dataBasicList;
	}

	public int getDevCode() {
		return devCode;
	}

	public void setDevCode(int devCode) {
		this.devCode = devCode;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getAssetSmallTypeName() {
		return assetSmallTypeName;
	}

	public void setAssetSmallTypeName(String assetSmallTypeName) {
		this.assetSmallTypeName = assetSmallTypeName;
	}

	public AssetSmallType getAssetSmallType() {
		return assetSmallType;
	}

	public void setAssetSmallType(AssetSmallType assetSmallType) {
		this.assetSmallType = assetSmallType;
	}

	public List<AssetSmallType> getAssetSmallTypeListAll() {
		return AssetSmallTypeListAll;
	}

	public void setAssetSmallTypeListAll(List<AssetSmallType> assetSmallTypeListAll) {
		AssetSmallTypeListAll = assetSmallTypeListAll;
	}

	public String getSmalltypename() {
		return smalltypename;
	}

	public void setSmalltypename(String smalltypename) {
		this.smalltypename = smalltypename;
	}

	public List<AssetType> getAssetTypeListAll() {
		return AssetTypeListAll;
	}

	public Vinasset getVinasset() {
		return vinasset;
	}

	public void setVinasset(Vinasset vinasset) {
		this.vinasset = vinasset;
	}

	public void setAssetTypeListAll(List<AssetType> assetTypeListAll) {
		AssetTypeListAll = assetTypeListAll;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public List<Vinasset> getVinassetList() {
		return vinassetList;
	}

	public void setVinassetList(List<Vinasset> vinassetList) {
		this.vinassetList = vinassetList;
	}

	public Map getDoubleMap() {
		return doubleMap;
	}

	public void setDoubleMap(Map doubleMap) {
		this.doubleMap = doubleMap;
	}
	
	
	
	
	}
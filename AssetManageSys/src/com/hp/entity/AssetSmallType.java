package com.hp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AssetSmallType entity. @author MyEclipse Persistence Tools
 */

public class AssetSmallType implements java.io.Serializable {

	// Fields

	private Integer id;
	private AssetType assetType;
	private String smalltypename;
	private Set dataBasics = new HashSet(0);

	// Constructors

	/** default constructor */
	public AssetSmallType() {
	}

	/** minimal constructor */
	public AssetSmallType(AssetType assetType, String smalltypename) {
		this.assetType = assetType;
		this.smalltypename = smalltypename;
	}

	/** full constructor */
	public AssetSmallType(AssetType assetType, String smalltypename,
			Set dataBasics) {
		this.assetType = assetType;
		this.smalltypename = smalltypename;
		this.dataBasics = dataBasics;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AssetType getAssetType() {
		return this.assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public String getSmalltypename() {
		return this.smalltypename;
	}

	public void setSmalltypename(String smalltypename) {
		this.smalltypename = smalltypename;
	}

	public Set getDataBasics() {
		return this.dataBasics;
	}

	public void setDataBasics(Set dataBasics) {
		this.dataBasics = dataBasics;
	}

}
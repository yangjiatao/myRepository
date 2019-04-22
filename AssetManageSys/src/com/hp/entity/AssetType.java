package com.hp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AssetType entity. @author MyEclipse Persistence Tools
 */

public class AssetType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String typeName;
	private Set assetSmallTypes = new HashSet(0);

	// Constructors

	/** default constructor */
	public AssetType() {
	}

	/** minimal constructor */
	public AssetType(String typeName) {
		this.typeName = typeName;
	}

	/** full constructor */
	public AssetType(String typeName, Set assetSmallTypes) {
		this.typeName = typeName;
		this.assetSmallTypes = assetSmallTypes;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Set getAssetSmallTypes() {
		return this.assetSmallTypes;
	}

	public void setAssetSmallTypes(Set assetSmallTypes) {
		this.assetSmallTypes = assetSmallTypes;
	}

}
package com.hp.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DataBasic entity. @author MyEclipse Persistence Tools
 */

public class DataBasic implements java.io.Serializable {

	// Fields

	private Integer devCode;
	private AssetSmallType assetSmallType;
	private String devName;
	private String brand;
	private String model;
	private String fac;
	private String acc;
	private String price;
	private Date date;
	private Integer quantity;
	private String department;
	private Set vinassets = new HashSet(0);
	private AssetType assetType;

	// Constructors

	/** default constructor */
	public DataBasic() {
	}

	/** minimal constructor */
	public DataBasic(Integer devCode, AssetSmallType assetSmallType) {
		this.devCode = devCode;
		this.assetSmallType = assetSmallType;
	}

	/** full constructor */
	public DataBasic(Integer devCode, AssetSmallType assetSmallType,
			String devName, String brand, String model, String fac, String acc,
			String price, Date date, Integer quantity, String department,
			Set vinassets) {
		this.devCode = devCode;
		this.assetSmallType = assetSmallType;
		this.devName = devName;
		this.brand = brand;
		this.model = model;
		this.fac = fac;
		this.acc = acc;
		this.price = price;
		this.date = date;
		this.quantity = quantity;
		this.department = department;
		this.vinassets = vinassets;
	}

	// Property accessors

	public Integer getDevCode() {
		return this.devCode;
	}

	public void setDevCode(Integer devCode) {
		this.devCode = devCode;
	}

	public AssetSmallType getAssetSmallType() {
		return this.assetSmallType;
	}

	public void setAssetSmallType(AssetSmallType assetSmallType) {
		this.assetSmallType = assetSmallType;
	}

	public String getDevName() {
		return this.devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFac() {
		return this.fac;
	}

	public void setFac(String fac) {
		this.fac = fac;
	}

	public String getAcc() {
		return this.acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Set getVinassets() {
		return this.vinassets;
	}

	public void setVinassets(Set vinassets) {
		this.vinassets = vinassets;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	
}
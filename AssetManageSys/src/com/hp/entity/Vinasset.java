package com.hp.entity;


import java.util.Date;



/**
 * Vinasset entity. @author MyEclipse Persistence Tools
 */

public class Vinasset implements java.io.Serializable {

	// Fields

	private Integer id;
	private DataBasic dataBasic;
	private Date vinDate;
	private Double vinCost;

	// Constructors

	/** default constructor */
	public Vinasset() {
	}

	/** minimal constructor */
	public Vinasset(DataBasic dataBasic) {
		this.dataBasic = dataBasic;
	}

	/** full constructor */
	public Vinasset(DataBasic dataBasic, Date vinDate, Double vinCost) {
		this.dataBasic = dataBasic;
		this.vinDate = vinDate;
		this.vinCost = vinCost;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DataBasic getDataBasic() {
		return this.dataBasic;
	}

	public void setDataBasic(DataBasic dataBasic) {
		this.dataBasic = dataBasic;
	}

	public Date getVinDate() {
		return this.vinDate;
	}

	public void setVinDate(Date vinDate) {
		this.vinDate = vinDate;
	}

	public Double getVinCost() {
		return this.vinCost;
	}

	public void setVinCost(Double vinCost) {
		this.vinCost = vinCost;
	}

}
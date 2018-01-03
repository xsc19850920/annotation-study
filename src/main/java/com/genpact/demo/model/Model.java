package com.genpact.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.genpact.demo.CheckAttr;
import com.genpact.demo.CheckAttr.EDataType;

public class Model {
	@NotNull
	@CheckAttr(colName="id",tableName="Model",dataType={EDataType.NotNull})
	private String id;
	
	@CheckAttr(colName="id",tableName="Model",dataType={EDataType.BeforeToday})
	private Date date;
	
	private Integer intvar;
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getIntvar() {
		return intvar;
	}
	public void setIntvar(Integer intvar) {
		this.intvar = intvar;
	}
	
	public Model() {
	}
	public Model(String id, Date date, Integer intvar) {
		this.id = id;
		this.date = date;
		this.intvar = intvar;
	}
	public Model(Date date, Integer intvar) {
		this.date = date;
		this.intvar = intvar;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", date=" + date + ", intvar=" + intvar + "]";
	}
	
	
	
}

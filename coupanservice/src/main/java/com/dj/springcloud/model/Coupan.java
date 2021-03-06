package com.dj.springcloud.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coupan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long i;
	private String code;
	private BigDecimal discount;
	private String expDate;
	
	public Long getI() {
		return i;
	}
	public void setI(Long i) {
		this.i = i;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	
}

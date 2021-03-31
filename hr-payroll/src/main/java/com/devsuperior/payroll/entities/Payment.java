package com.devsuperior.payroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncome;
	private Integer days;
	
	
//	Construtores
	@Deprecated
	public Payment() {
	}

	public Payment(String name, Double dailyIncome, Integer days) {
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}
	
//	Getters
	public String getName() {
		return name;
	}
	
	public Double getDailyIncome() {
		return dailyIncome;
	}
	
	public Integer getDays() {
		return days;
	}
	
	public Double getTotal() {
		return this.days * this.dailyIncome;
	}
	
}

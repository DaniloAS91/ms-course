package com.devsuperior.payroll.entities;

import java.io.Serializable;


public class Worker implements Serializable{
	private static final long serialVersionUID = 1L; // Para poder tranformar o objeto em bytes prevenindo erros
	
	private Long id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}
	
//	Getters
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getDailyIncome() {
		return dailyIncome;
	}
}

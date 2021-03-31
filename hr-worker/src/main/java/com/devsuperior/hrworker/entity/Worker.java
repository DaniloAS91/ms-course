package com.devsuperior.hrworker.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable{
	private static final long serialVersionUID = 1L; // Para poder tranformar o objeto em bytes prevenindo erros
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

package com.TESTER;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="morattu")
public class Entityy {
	@Id
	private int id;
	private String kuthu;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKuthu() {
		return kuthu;
	}
	public void setKuthu(String kuthu) {
		this.kuthu = kuthu;
	}

}

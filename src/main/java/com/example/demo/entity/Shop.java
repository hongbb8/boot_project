package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="a_shop")
public class Shop{
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sid;
	@Column(name="sname")
    private String sname;
	@Column(name="leve")
    private String leve;
	@Column(name="datea")
    private String datea;
	
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLeve() {
		return leve;
	}
	public void setLeve(String leve) {
		this.leve = leve;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
    
	
}

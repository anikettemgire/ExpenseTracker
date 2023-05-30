package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
public class ExpenseDeatil {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
    
	private String title;
	private String date;
	private String time;
	private String Descrip;
	private String price;
	@ManyToOne
	private User u;
	public ExpenseDeatil(int eid, String title, String date, String time, String descrip, String price, User u) {
		super();
		this.eid = eid;
		this.title = title;
		this.date = date;
		this.time = time;
		Descrip = descrip;
		this.price = price;
		this.u = u;
	}
	public ExpenseDeatil(String title, String date, String time, String descrip, String price, User u) {
		super();
		this.title = title;
		this.date = date;
		this.time = time;
		Descrip = descrip;
		this.price = price;
		this.u = u;
	}
	
	public ExpenseDeatil(int eid, String title, String date, String time, String descrip, String price) {
		super();
		this.eid = eid;
		this.title = title;
		this.date = date;
		this.time = time;
		Descrip = descrip;
		this.price = price;
	}
	public ExpenseDeatil() {
		super();
	}
	public int getId() {
		return eid;
	}
	public void setId(int eid) {
		this.eid = eid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescrip() {
		return Descrip;
	}
	public void setDescrip(String descrip) {
		Descrip = descrip;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "ExpenseDeatil [id=" + eid + ", title=" + title + ", date=" + date + ", time=" + time + ", Descrip="
				+ Descrip + ", price=" + price + ", u=" + u + "]";
	}
	
	
}
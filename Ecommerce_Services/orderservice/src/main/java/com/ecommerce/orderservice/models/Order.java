package com.ecommerce.orderservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order {
	@Id
	private String orderid;
	private String orderamount;
	private String orderdate;
	private String userid;
	
	public Order() {
		
	}
	
	public Order(String orderid, String orderamount, String orderdate, 
			String userId) {
		this.setorderid(orderid);
		this.setorderamount(orderamount);
		this.setorderdate(orderdate);
		this.setUserId(userid);
	}

	public String getorderid() {
		return orderid;
	}

	public void setorderid(String orderid) {
		this.orderid = orderid;
	}

	public String getorderamount() {
		return orderamount;
	}

	public void setorderamount(String orderamount) {
		this.orderamount = orderamount;
	}

	public String getorderdate() {
		return orderdate;
	}

	public void setorderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getuserid() {
		return userid;
	}

	public void setUserId(String userid) {
		this.userid = userid;
	}
	
}

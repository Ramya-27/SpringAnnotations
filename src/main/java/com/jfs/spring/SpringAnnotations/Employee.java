package com.jfs.spring.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	
	private int eid;
	
	private String ename;
	
	
	private Address address;
	
	@Value("123")
	public void setEid(int eid) {
		System.out.println("set eid");
		this.eid = eid;
	}

	@Value("sony")
	public void setEname(String  ename) {
		System.out.println("set ename");
		this.ename = ename;
	}
	
	@Autowired
	@Qualifier("add1")
	
	public void setAddress(Address address) {
		System.out.println("set address");
		this.address = address;
	}
	
	public void show()
	{
		System.out.println(eid+" "+ename);
		System.out.println(address);
		}
	
	
	

}

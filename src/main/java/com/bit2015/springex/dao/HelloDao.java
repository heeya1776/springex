package com.bit2015.springex.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
	public void hello(){
		System.out.println("HelloDao:hello");
	}
}

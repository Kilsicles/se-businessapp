package com.businessapp;

import static org.junit.Assert.*;

import org.junit.Before;

import com.businessapp.pojos.Customer;

import org.junit.Test;

public class CustomersTest {
	
	Customer c = new Customer ("","");
	
	@Before
	public void beforeFunction(){
        c.setName("");
    }
	
	
	@Test
	public void test() {
		c.setName("Meyer");
		assertEquals(c.getName(), "Meyer");
	}
	
	@Test
	public void testNull() {
		c.setName(null);
		assertEquals(c.getName(), null);
	}
	
	@Test
	public void testEmpty() {
		assertEquals(c.getName(), "");
	}

}

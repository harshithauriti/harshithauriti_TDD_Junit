package com.epam.tdd.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassA {

	@Test
	public void test() {
		ClassA a=new ClassA();
		assertEquals("BCD",a.remove("ABCD"));
		assertEquals("CD",a.remove("AACD"));
		assertEquals("BCD",a.remove("BACD"));
		assertEquals("BBAA",a.remove("BBAA"));
		assertEquals("BAA",a.remove("AABAA"));
	}

}

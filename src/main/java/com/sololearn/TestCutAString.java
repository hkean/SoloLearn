package com.sololearn;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCutAString {

	String a = "111222334555";
	String b = "aaabbbccddefff";
	String c = "xxx8888yy9999zzzz0";
	String d = "1112221111222";
	String e = "aaBbAaaacCCc";
	
	@Test
	public void test1() {
		String expected ="[111, 222, 33, 4, 555]";
		CutAString c = new CutAString();
//		c.split(a);
		assertEquals(expected, c.split(a).toString());
	}
	
	@Test
	public void test2() {
//		String expected ="";
		CutAString c = new CutAString();
		assertEquals(null, c.split(""));
	}
	
}

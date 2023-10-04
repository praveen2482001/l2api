package com.jtest;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.demsum.Sum;

public class Jtest {
	Sum sum=new Sum();
	@Test
	@DisplayName("Assert equal test Case")
	public void assertEqual() {
		Assertions.assertEquals(4,sum.add(2, 2));
	}
	
	@Test
	@DisplayName("Assert Array Equal test case")
	public void assertArray() {
		Assertions.assertArrayEquals(new int[] {1,2,4}, new int[] {1,2,4});
	}

	@Test
	@DisplayName("Assert NotEqual test Case")
	public void assertNotEqual() {
		Assertions.assertNotEquals(5,sum.add(2, 2));
	}
	@Test
	@DisplayName("Assert Iterable test Case")
	public void assertIterableEqual() {
		Iterable<Integer> listone=new ArrayList<>(Arrays.asList(1,2,3));
		Iterable<Integer> listtwo=new ArrayList<>(Arrays.asList(1,2,3));
		Assertions.assertIterableEquals(listone, listtwo);
	}
	
	@Test
	@DisplayName("Assert not null Test")
	public void assertNotnullTest() {
		String nulString="";
		Assertions.assertNotNull(nulString);
	}
	
	@Test
	@DisplayName("Assert true Test")
	public void AssertTruetest() {
		boolean istrue=true;
		boolean isfalse =false;
		Assertions.assertTrue(istrue,"its false");
	}
	

}

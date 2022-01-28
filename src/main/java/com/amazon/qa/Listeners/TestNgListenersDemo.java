package com.amazon.qa.Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.amazon.qa.Listeners.TestNgListeners.class)
public class TestNgListenersDemo 
{
	@Test
	public void test1()
	{
		System.out.println("I am inside Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("I am inside Test2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		System.out.println("I am inside Test3");
		throw new SkipException("This test case is skipped..Test3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("I am inside Test4");
	}

}

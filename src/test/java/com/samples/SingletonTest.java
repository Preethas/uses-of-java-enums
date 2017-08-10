package com.samples;

import static org.junit.Assert.*;

import org.junit.Test;

import com.samples.Singleton.Logger;

public class SingletonTest {
  
	@Test
	public void testSingletonInvocation(){
		assertEquals(Logger.getLogger().log(),true);
	}
}

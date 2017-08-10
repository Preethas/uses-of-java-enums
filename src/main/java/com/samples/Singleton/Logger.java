package com.samples.Singleton;

public enum Logger {
  INSTANCE;
	
  public static Logger getLogger(){
	  return INSTANCE;
  }
  
  public boolean log(){
	  System.out.println("Logging started");
	  return true;
  }
  
}

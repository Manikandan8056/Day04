package com.excercise2;

public class Product {

	private String name;
	
	public Product(String name) {
		super();
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	 @Override
	    protected void finalize() throws Throwable { 
	        System.out.println("Finalize method called before GC process");
	    }
	 

}

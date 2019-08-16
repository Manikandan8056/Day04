package com.excercise2
;

import com.excercise2.Product;

public class TestGc {

	public static void main(String[] args) throws Throwable {

		Product p1 = new Product("Lenova ");
        Product p2 = new Product("Samsung");
        
        Product p3 = p1;
        
        Product p4 = p1;
        
        
        p2 = null;
        
        p1 =  null;
        
        p4 = p1;
        p4 = p3;
        
        //p3 = null;
       System.out.println(p3.getName());
       try {
       System.out.println(p4.getName());
       }catch(NullPointerException e) {
    	   e.printStackTrace();
       }
       
       System.gc();
        
    }              
	}



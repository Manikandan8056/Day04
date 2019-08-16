package com.excercise;

public class TestBook {

	public static void main(String[] args) {

		BookInfo book1= new BookInfo();
		book1.bookname="C";
		book1.setCost(200);
		book1.author="c-author";
		
		System.out.println("Tittle :"+book1.bookname +" ,Price :"+book1.getCost() +" ,Author :"+book1.author );
		
		BookInfo book2=new BookInfo("JAVA",400,"JAVA-author");
		//System.out.println("Tittle :"+book2.bookname +" ,Price :"+book2.getCost() +" ,Author :"+book2.author );
		System.out.println(book2);
		
		BookInfo book3=new BookInfo("HTML",500,"HTML-author");
		System.out.println(book3.toString());
	}

}

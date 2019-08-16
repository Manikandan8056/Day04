package com.excercise;

public class TestObjEquality {

	public static void main(String[] args) {

		BookInfo book1 = new BookInfo("C", 200, "Balaguruswamy");
        
		BookInfo book2 = new BookInfo("C", 200, "Balaguruswamy");
        
		BookInfo book3 = book1;
        
        System.out.println("HashCode =>book1:" + book1.hashCode() + ",book2:" + book2.hashCode() +",book3:" + book3.hashCode());
        System.out.println("Is book1==book2 ?" + (book1 == book2));
        System.out.println("Is book1.equals(book2) ?" + (book1.equals(book2)));
        
        System.out.println("Is book1==book3 ?" + (book1 == book3));
        System.out.println("Is book1.equals(book3) ?" + (book1.equals(book3)));
    }
}

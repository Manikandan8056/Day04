package com.excercise;

public class BookInfo {

	public String bookname;
	
	private int cost;
	
	public String author;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		if(cost<0) {
			throw new IllegalArgumentException("Invalid value");
		}
		this.cost = cost;
	}
	
	public BookInfo() {
		System.out.println("Default constructor");
	}
	public BookInfo(String bookname, int cost, String author) {
		this.bookname=bookname;
		this.cost=cost;
		this.author=author;
	}
	@Override //annotation
    public String toString() {
        //return "[ title: " + bookname + " ,price: " + cost +" ,Author :"+ author +" ]"; 
        
        StringBuilder content = new StringBuilder();
        content.append("[ ");
        content.append("Title:").append(this.bookname).append(",");
        content.append("Price:").append(this.cost).append(",");
        content.append("AuthorName:").append(this.author);
        content.append("]");
        return content.toString();
        
      
    }
}

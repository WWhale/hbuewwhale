package com.hbue.entity;
import java.util.Date;

public class Book {
	private int book_id;
	private String book_name;
	private String book_author;
	private String book_press;
	private double book_originprice;
	private double book_price;
	private Date book_time;
	private Date book_buytime;
	private int book_stock;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_press() {
		return book_press;
	}
	public void setBook_press(String book_press) {
		this.book_press = book_press;
	}
	public double getBook_originprice() {
		return book_originprice;
	}
	public void setBook_originprice(double book_originprice) {
		this.book_originprice = book_originprice;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public Date getBook_time() {
		return book_time;
	}
	public void setBook_time(Date book_time) {
		this.book_time = book_time;
	}
	public Date getBook_buytime() {
		return book_buytime;
	}
	public void setBook_buytime(Date book_buytime) {
		this.book_buytime = book_buytime;
	}
	public int getBook_stock() {
		return book_stock;
	}
	public void setBook_stock(int book_stock) {
		this.book_stock = book_stock;
	}
	
	
}

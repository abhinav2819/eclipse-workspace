package com.springcore.AutoWire.viaXML;

public class Book1 {
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
		System.out.println("Setter method (Book1)");
	}

	public Book1() {
		super();
	}

	public Book1(Author author) {
		super();
		this.author = author;
		System.out.println("By field Constructor Method (Book1)");
	}

	@Override
	public String toString() {
		return "Book1 [author=" + author + "]";
	}
	
}

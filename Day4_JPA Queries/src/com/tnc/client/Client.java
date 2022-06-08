package com.tnc.client;

import com.tns.service.BookService;
import com.tns.service.BookServiceImpl;

public class Client {
	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		System.out.println("Listing totakl no.of the books: ");
		System.out.println("Total  books:"+service.getBoookCount());
		System.out.println("Listing book with id:104 ");

	}
}

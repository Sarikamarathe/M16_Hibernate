package com.tns.service;

import java.util.List;

import com.tnc.dao.BookDao;
import com.tnc.dao.BookDaoImpl;
import com.tnc.entities.Book;

public class BookServiceImpl implements BookService
{
	private BookDao dao;
	
	
	public BookServiceImpl()
	{
		dao =new BookDaoImpl();
	}


	@Override
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}


	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}


	@Override
	public Long getBoookCount() {
		return dao.getBoookCount();
	}


	@Override
	public List<Book> getAuthorBooks(String author) {
		return dao.getAuthorBooks(author);
	}


	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}


	@Override
	public List<Book> getAllBooksPriceRange(double low, double high) {
		return dao.getAllBooksPriceRange(low, high);
	}


}

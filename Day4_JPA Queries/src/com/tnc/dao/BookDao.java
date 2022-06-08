package com.tnc.dao;

import java.util.List;

import com.tnc.entities.Book;

public interface BookDao 
{
	public abstract Book getBookById(int id);
	public abstract List<Book> getBookByTitle(String title);
	public abstract Long getBoookCount();
	public abstract List<Book> getAuthorBooks(String author);
	public abstract List<Book> getAllBooks();
	public abstract List<Book> getAllBooksPriceRange(double low, double high);
}

package com.apress.books.dao;

import java.util.List;

import com.apress.books.model.Book;
import com.apress.books.model.Category;

public interface BookDao {
	
	// Method for listing all the books from database
	public List<Book>findAllBooks();
	
	// Method that allow user to search books by keyword = "title of book", "first and last name of author"
	public List<Book>searchBooksByKeyword(String keyWord);
	
	// Method to provide a categorized listing of books
	public List<Category>findAllCategories();
	
	// Insert, Update and Delete book
	public void insert(Book book);
	public void update(Book book);
	public void delete(Long bookId);
}

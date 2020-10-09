package com.apress.books.client;

import java.util.List;

import com.apress.books.dao.BookDao;
import com.apress.books.dao.BookDaoImpl;
import com.apress.books.model.Book;

public class BookApp {
	
	private static BookDao bookDao = new BookDaoImpl();
	
	public static void main(String[] args) {
		
		// List all books
		System.err.println("Listing all Books:");
		findAllBooks();
		System.out.println();
		
		// Search book by keyword
		System.err.println("Search book by keyword in book title : Groovy:");
		
		searchBooks("Groovy");
		System.out.println();
		
		System.err.println("Search book by keyword in author's name : Josh:");
		searchBooks("Josh");
}
	
	private static void findAllBooks() {
		List<Book> books = bookDao.findAllBooks();
		
		for (Book book : books) {
			System.out.println(book);
		}
		
	}
	
	private static void searchBooks(String keyWord) {
	
	List<Book> books = bookDao.searchBooksByKeyword(keyWord);
	for (Book book : books) {
		System.out.println(book);
	}
	}
}

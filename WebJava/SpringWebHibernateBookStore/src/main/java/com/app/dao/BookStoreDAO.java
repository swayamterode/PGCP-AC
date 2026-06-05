package com.app.dao;

import java.util.List;

import com.app.entity.BookStore;

public interface BookStoreDAO {
	List<BookStore> getListOfAllBooks();

	void saveBookDetails(BookStore book);

	BookStore getBookDetails(int id);

	BookStore deleteBook(int id);
}

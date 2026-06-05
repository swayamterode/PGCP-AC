package com.app.service;

import java.util.List;
import com.app.entity.BookStore;

public interface BookStoreService {
	List<BookStore> getListOfAllBooks();

	void saveBookDetails(BookStore book);

	BookStore getBookDetails(int id);

	BookStore deleteBook(int id);
}
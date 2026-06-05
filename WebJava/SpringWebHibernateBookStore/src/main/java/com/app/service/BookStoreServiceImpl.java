package com.app.service;

import com.app.dao.BookStoreDAO;
import com.app.entity.BookStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class BookStoreServiceImpl implements BookStoreService {

	@Autowired
	private BookStoreDAO bookStoreDao;

	@Override
	@Transactional
	public List<BookStore> getListOfAllBooks() {
		return bookStoreDao.getListOfAllBooks();
	}

	@Override
	@Transactional
	public void saveBookDetails(BookStore theBook) {
		bookStoreDao.saveBookDetails(theBook);
	}

	@Override
	@Transactional
	public BookStore getBookDetails(int theId) {
		return bookStoreDao.getBookDetails(theId);
	}

	@Override
	@Transactional
	public BookStore deleteBook(int theId) {
		return bookStoreDao.deleteBook(theId);
	}
}
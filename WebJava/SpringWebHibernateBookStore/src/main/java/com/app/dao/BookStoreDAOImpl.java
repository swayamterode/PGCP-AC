package com.app.dao;

import com.app.entity.BookStore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookStoreDAOImpl implements BookStoreDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<BookStore> getListOfAllBooks() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from BookStore", BookStore.class).list();
	}

	@Override
	public void saveBookDetails(BookStore theBook) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(theBook);
	}

	@Override
	public BookStore getBookDetails(int theId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(BookStore.class, Integer.valueOf(theId));
	}

	@Override
	public BookStore deleteBook(int theId) {
		Session session = sessionFactory.getCurrentSession();
		BookStore theBook = session.get(BookStore.class, Integer.valueOf(theId));
		if (theBook != null) {
			session.remove(theBook);
		}
		return theBook;
	}
}
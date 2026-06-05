package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.BookStore;
import com.app.service.BookStoreService;

@Controller
@RequestMapping("/bookstore")
public class BookController {
	@Autowired
	private BookStoreService bookStoreService;

	@GetMapping("/list")
	public String showBooksList(Model theModel) {
		List<BookStore> theBooks = bookStoreService.getListOfAllBooks();
		System.out.println("Books List Data: " + theBooks);
		theModel.addAttribute("listBooks", theBooks);
		return "books-list";
	}

	@GetMapping("/showForm")
	public String showAddBookForm(Model theModel) {
		BookStore theBook = new BookStore();
		theModel.addAttribute("book", theBook);
		return "book-form";
	}

	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") BookStore theBook) {
		bookStoreService.saveBookDetails(theBook);
		return "redirect:/bookstore/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showEditBookForm(@RequestParam("bookId") int theId, Model model) {
		BookStore theBook = bookStoreService.getBookDetails(theId);
		model.addAttribute("book", theBook); // chances of error
		return "book-form";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("bookId") int theId, Model model) {
		BookStore theBook = bookStoreService.deleteBook(theId);
		model.addAttribute("book", theBook);
		return "redirect:/bookstore/list";
	}
}

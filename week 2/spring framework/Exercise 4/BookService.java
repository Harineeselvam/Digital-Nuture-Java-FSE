package com.smartlibrary.service;

import com.smartlibrary.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("Book Service Created");
        bookRepository.displayBook();
    }

}
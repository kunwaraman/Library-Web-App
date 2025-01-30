package com.Library.LibraryManagmentSystem.controller;


import com.Library.LibraryManagmentSystem.dto.request.BookDto;
import com.Library.LibraryManagmentSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

//    @PostMapping("/add")
    @PostMapping
    public BookDto createBook(@RequestBody com.Library.LibraryManagmentSystem.dto.request.BookDto request){
        return bookService.createBook(request);
    }

}

package com.Library.LibraryManagmentSystem.service;

import com.Library.LibraryManagmentSystem.dto.request.BookDto;
import com.Library.LibraryManagmentSystem.model.Author;
import com.Library.LibraryManagmentSystem.model.Book;
import com.Library.LibraryManagmentSystem.repository.BookRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class BookService {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookRepository bookRepository;

    public BookDto createBook(com.Library.LibraryManagmentSystem.dto.request.BookDto request){
        // check if this author already exists or not
        // check if this book already exists or not
        // save book
        // check weather already exists or not
        Author author = authorService.findAuthorByEmail(request.getAuthorEmail());

        // if author is not exists creating a new author object and once author object is created
        if(author==null){
            // create and save this author in db
            author=Author.builder().name(request.getAuthorName())
                    .email(request.getAuthorEmail()).build();
            author=authorService.createAuthor(author);
        }
        // continue 26--- once author object is create dwe are creating the book object
        //create a book
        Book currentBook=request.createBook();
//        System.out.println(currentBook);
        currentBook=bookRepository.save(currentBook); // once the book object is created  we are saving it in db

        return BookDto.builder().bookNo(currentBook.getBookNo())
                .bookType(currentBook.getBookType()).build();
    }
}

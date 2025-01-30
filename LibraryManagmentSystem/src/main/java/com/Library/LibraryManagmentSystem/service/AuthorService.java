package com.Library.LibraryManagmentSystem.service;


import com.Library.LibraryManagmentSystem.model.Author;
import com.Library.LibraryManagmentSystem.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public Author findAuthorByEmail(String email) {
        return authorRepository.findByEmail(email);
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }
}

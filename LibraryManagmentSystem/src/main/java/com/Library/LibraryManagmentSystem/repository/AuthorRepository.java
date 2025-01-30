package com.Library.LibraryManagmentSystem.repository;

import com.Library.LibraryManagmentSystem.model.Author;
import com.Library.LibraryManagmentSystem.model.AuthorCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends JpaRepository<Author, AuthorCompositeKey> {
    // 1st way to writing query
    Author findByEmail(String email);


    // 2nd way to writing query
    @Query(value = "select a from author a where a.email = ?1", nativeQuery = true)
    Author getAuthor(String email);

    // 3rd way to writing query
    @Query(value = "select a from author a where a.email = :email", nativeQuery = true)
    Author getAuthorByEmail(String email);
}

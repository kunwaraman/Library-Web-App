package com.Library.LibraryManagmentSystem.repository;

import com.Library.LibraryManagmentSystem.model.Author;
import com.Library.LibraryManagmentSystem.model.AuthorCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, AuthorCompositeKey> {

}

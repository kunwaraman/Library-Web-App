package com.Library.LibraryManagmentSystem.repository;

import com.Library.LibraryManagmentSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}

package com.Library.LibraryManagmentSystem.dto.response;

import com.Library.LibraryManagmentSystem.model.Book;
import com.Library.LibraryManagmentSystem.model.Txn;
import jakarta.persistence.OneToMany;

import java.util.List;

public class UserResponseDto {

    private String email;
    private String phoneNumber;

    private List<Book> books;
    private String name;

    private List<Txn> txns;


    public UserResponseDto(String email, String phoneNumber, List<Book> books, String name, List<Txn> txns) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.books = books;
        this.name = name;
        this.txns = txns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Txn> getTxns() {
        return txns;
    }

    public void setTxns(List<Txn> txns) {
        this.txns = txns;
    }
}

package com.Library.LibraryManagmentSystem.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
/*
Kabhi-kabhi ek single field unique nahi hoti, jaise:
Ek email kisi author ka ho sakta hai, lekin agar do alag authors ka naam same ho toh conflict hoga.
Isliye email + name ko combine karke unique key banayi gayi hai.

 */
@IdClass(AuthorCompositeKey.class) // to make composite key as a primary key
//Isse Hibernate ko pata chalta hai ki AuthorCompositeKey class ka use composite key ke liye hoga.
public class Author {

    // give a demo of compositeKey
    // email+name is primary key
    @Id
    private String email;
    @Id
    private String name;

    // make query to a book table and search for this author
    //one query
    // getter and setter

    @OneToMany(mappedBy = "author") // mappedBy Hibernate ko batata hai ki Books table mein kaunsa field (variable) Author ko refer kar raha hai.
    /*
    mappedBy = "author" ka matlab hai ki Book entity ke andar ek
    field hoga jiska naam author hai, jo Author entity ko refer karega.
     */

    private List<Book> books; // because this person can write many books so we can take list

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

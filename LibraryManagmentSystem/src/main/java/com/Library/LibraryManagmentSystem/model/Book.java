package com.Library.LibraryManagmentSystem.model;


import com.Library.LibraryManagmentSystem.constant.BookType;
import jakarta.persistence.*;
import jakarta.transaction.Transaction;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.util.List;
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Builder
@Data
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;

    @Column(unique = true,nullable = false)
    private String bookNo;
    @Positive
    private double SecurityAmount;

    @Enumerated(value = EnumType.STRING)
    private BookType bookType;

    // now to tell hibernateyou need to store the information in the book table add annotaion called joincolumn
    @ManyToOne // bc many book assocaited with one user
    @JoinColumn
    private User user;
    // on the book side i will store the id of user who has issued the book


    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "author_name", referencedColumnName = "name"),
            @JoinColumn(name = "author_email", referencedColumnName = "email"),
    })

    // so here what we need to do this  we need to specify to hibernate like what all things its should
    // store int this table

    // it is a combination of two things email and name
    private Author author;

    @OneToMany(mappedBy = "book") // bc one book can have many transactions for one user so we use list
    private List<Txn> txns;


//    public Book(String id, String title, String bookNo, Double securityAmount, User user, Author author, List<Txn> txns) {
//        this.id = id;
//        this.title = title;
//        this.bookNo = bookNo;
//        SecurityAmount = securityAmount;
//        this.user = user;
//        this.author = author;
//        this.txns = txns;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getBookNo() {
//        return bookNo;
//    }
//
//    public void setBookNo(String bookNo) {
//        this.bookNo = bookNo;
//    }
//
//    public void setSecurityAmount(Double securityAmount) {
//        SecurityAmount = securityAmount;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
//
//    public List<Txn> getTxns() {
//        return txns;
//    }
//
//    public void setTxns(List<Txn> txns) {
//        this.txns = txns;
//    }
//
//    public Double getSecurityAmount() {
//        return SecurityAmount;
//    }
//
//    public BookType getBookType() {
//        return bookType;
//    }
//
//    public void setBookType(BookType bookType) {
//        this.bookType = bookType;
//    }

}
/*
one book can be issued by one user
but one user can issue many books


AN AUTHOR CAN WRITE MULTIPLE BOOKS
BUT ONE BOOKS WILL HAVE ONE AUTHOR
 */

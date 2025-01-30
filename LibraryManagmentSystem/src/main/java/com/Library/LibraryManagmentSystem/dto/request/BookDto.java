package com.Library.LibraryManagmentSystem.dto.request;


import com.Library.LibraryManagmentSystem.constant.BookType;
import com.Library.LibraryManagmentSystem.model.Author;
import com.Library.LibraryManagmentSystem.model.Book;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class BookDto {
    private String title;

    @NotBlank(message = "bookNo can't be blank")
    private String bookNo;

    @Positive
    private double securityAmount;
    private BookType bookType;
    private String authorEmail;
    private String authorName;

    public Book createBook(){
        Author author = Author.builder().email(authorEmail).name(authorName).build();
        System.out.println(author);
        return Book.builder().title(title).bookNo(bookNo).bookType(bookType).author(author).build();
    }


}

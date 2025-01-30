package com.Library.LibraryManagmentSystem.model;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor

public class AuthorCompositeKey {
    private String email;
    private String name;

    public AuthorCompositeKey(String email, String name) {
        this.email = email;
        this.name = name;
    }

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
}

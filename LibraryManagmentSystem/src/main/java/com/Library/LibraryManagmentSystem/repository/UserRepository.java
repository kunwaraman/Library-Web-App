package com.Library.LibraryManagmentSystem.repository;

import com.Library.LibraryManagmentSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}

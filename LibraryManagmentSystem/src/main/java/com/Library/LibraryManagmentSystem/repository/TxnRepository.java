package com.Library.LibraryManagmentSystem.repository;

import com.Library.LibraryManagmentSystem.model.Txn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TxnRepository  extends JpaRepository<Txn, String> {

}

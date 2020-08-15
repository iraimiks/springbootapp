package com.example.springjpadb.service;

import com.example.springjpadb.model.UserFormData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserFormDataRepo extends JpaRepository<UserFormData, Long> {
}

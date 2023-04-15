package com.practice.repository;

import com.practice.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {
}

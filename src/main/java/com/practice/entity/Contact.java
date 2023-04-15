package com.practice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTACT_DTLS")
public class Contact {

    @Id   //primary key
    @GeneratedValue // it will generate automatically
    @Column(name = "CONTACT_ID")
    private Integer contactId;
    @Column(name = "CONTACT_NAME")
    private String contactName;
    @Column(name = "CONTACT_EMAIL")
    private String contactEmail;
    @Column(name = "CONTACT_NUMBER")
    private Long contactNumber;

    @Column(name = "ISACTIVE")
    private String isActive;
}

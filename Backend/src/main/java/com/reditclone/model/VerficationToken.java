package com.reditclone.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;
@NoArgsConstructor
@Entity
@Table(name="token")
public class VerficationToken {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private  Long id;
    private String token;
    @OneToOne(fetch = LAZY)
    private  User user;
    private Instant expiryDate;
}

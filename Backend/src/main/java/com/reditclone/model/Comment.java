package com.reditclone.model;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.time.Instant;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;


@Builder
@Entity
public class Comment {
    @Id
@GeneratedValue(strategy = IDENTITY)
private  Long id;
    @NotEmpty

    private  String text;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "postId",referencedColumnName = "postId")
    private  Post post;
    private Instant creadtedDate;
    @ManyToOne(fetch =  LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

}

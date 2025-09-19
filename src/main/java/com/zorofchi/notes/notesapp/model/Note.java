package com.zorofchi.notes.notesapp.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String content;

}

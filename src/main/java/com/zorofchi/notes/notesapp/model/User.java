package com.zorofchi.notes.notesapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    private long id;

    @Size(min = 5 , max = 20)
    private String username;

    @Size(min = 5 , max = 20)
    private String password;





}

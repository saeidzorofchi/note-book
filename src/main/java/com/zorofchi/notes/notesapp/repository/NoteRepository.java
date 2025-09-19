package com.zorofchi.notes.notesapp.repository;

import com.zorofchi.notes.notesapp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}

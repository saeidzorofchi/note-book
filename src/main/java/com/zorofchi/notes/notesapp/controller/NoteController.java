package com.zorofchi.notes.notesapp.controller;

import com.zorofchi.notes.notesapp.model.Note;
import com.zorofchi.notes.notesapp.repository.NoteRepository;
import com.zorofchi.notes.notesapp.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private NoteService noteService;

    @PostMapping()
    public Note save(@RequestBody Note noteRequest) {
        return noteRepository.save(noteRequest);
    }

    @GetMapping("/{id}")
    public Note note(@PathVariable long id) {
        return noteRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        noteRepository.deleteById(id);
    }

    @PutMapping()
    public Note updateNote(@RequestBody Note noteRequest) {
        return noteService.update(noteRequest);
    }


}

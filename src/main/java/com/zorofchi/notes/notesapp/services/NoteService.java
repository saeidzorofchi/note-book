package com.zorofchi.notes.notesapp.services;

import com.zorofchi.notes.notesapp.model.Note;
import com.zorofchi.notes.notesapp.repository.NoteRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Data
@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note update(long id, Note noteRequest) {

        Note noteData = noteRequest;

        if (noteRequest.getTitle() != null)
            noteData.setTitle(noteRequest.getTitle());
        if (noteRequest.getContent() != null)
            noteData.setContent(noteRequest.getContent());
        return noteRepository.save(noteData);

    }
}

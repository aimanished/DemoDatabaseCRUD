package com.example.a16031940.demodatabasecrud;

import java.io.Serializable;

public class Note implements Serializable{
    private int  id;
    private String NoteContent;

    public Note(int id, String noteContent) {
        this.id = id;
        NoteContent = noteContent;
    }
    @Override
    public String toString() {
        return "ID:" + id + ", " + NoteContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteContent() {
        return NoteContent;
    }

    public void setNoteContent(String noteContent) {
        NoteContent = noteContent;
    }


}

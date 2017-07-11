package in.codingninjas.recycler;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by rohan on 11/07/17.
 */

public class Note {

    private String uuid;
    private String title;
    private String description;

    public Note(String title, String description){
        this.title = title;
        this.description = description;
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Note> getRandomNotes(int noOfNotes){
        ArrayList<Note> notes = new ArrayList<>();
        for(int i = 0;i<noOfNotes;i++){
            Note note = new Note("Title " + i,"Description " + i);
            notes.add(note);
        }
        return notes;
    }
}

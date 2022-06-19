package Assignment.Diary;

import java.util.ArrayList;
import java.util.Date;

public class Diary {
    private int id;
    private static int uid = 0;
    private String name;
    private final Date dateCreated;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String name) {
        this.id += ++uid;
        this.name = name;
        dateCreated = new Date();

    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEntry(Entry newNote){
        entries.add(newNote);
    }
    public Entry getEntry(int id){
        for(Entry entry: entries){
            if(entry.getId() == id){
                return entry;
            }
        }
        throw new IllegalArgumentException("Entry not found!");
    }

    public void getAllEntries(){
        for(Entry entry: entries){
            System.out.println(entry);
        }
    }

    public void deleteEntry(Entry entry){
        entries.remove(entry);
    }


    public String toString(){
        return "Id: " + id + "\nName: " + name + "\nDate Created: " + dateCreated + "\nNumber Of Entry: "+ entries.size();
    }


}

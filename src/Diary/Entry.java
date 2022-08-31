package Diary;

import java.util.Date;

public class Entry {
    private int id;
    private static int uid =0;
    private String title;
    private String body;
    private Date dateCreated = new Date();

    public Entry(String title, String body){
        this.title = title;
        this.body = body;
        this.id += ++uid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString(){
        return "id: " + id + "\ntitle: " + title + "\nbody: " + body + "\ndateCreated: " + dateCreated;
    }

}

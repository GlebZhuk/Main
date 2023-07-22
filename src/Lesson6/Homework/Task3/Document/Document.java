package Lesson6.Homework.Task3.Document;

import java.util.Date;

public abstract class Document {
    private int numberDoc;
    private Date date;

    public Document() {
    }

    public Document(int numberDoc, Date date) {
        this.numberDoc = numberDoc;
        this.date = date;
    }

    public int getNumberDoc() {
        return numberDoc;
    }

    public Date getDate() {
        return date;
    }

}


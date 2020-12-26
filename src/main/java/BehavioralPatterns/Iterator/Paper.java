package BehavioralPatterns.Iterator;

public class Paper {
    private PaperType paperType;
    private String name;
    private String author;
    private int publishYear;

    public Paper(PaperType paperType, String name, String author, int publishYear) {
        this.paperType = paperType;
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaperType(PaperType paperType) {
        this.paperType = paperType;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}

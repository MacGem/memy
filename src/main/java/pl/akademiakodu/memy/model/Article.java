package pl.akademiakodu.memy.model;

/**
 * Created by Damian on 02.08.2017.
 */
public class Article {

    private String title;
    private String description;

    public Article(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;

    }
    public String toString(){
        return title+" "+description;
    }

}

package pl.akademiakodu.memy.model;

/**
 * Created by macie on 02.08.2017.
 */
public class Article {

    private String title;
    private String discription;

    public Article() {
    }

    public Article(String title, String discription) {
        this.title = title;
        this.discription = discription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}

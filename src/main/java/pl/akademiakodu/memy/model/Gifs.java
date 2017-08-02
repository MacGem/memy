package pl.akademiakodu.memy.model;

/**
 * Created by macie on 02.08.2017.
 */
public class Gifs {
    private String name;
    private String favorite;

    public Gifs() {
    }

    public Gifs(String name) {
        this.name = name;
    }

    public Gifs(String name, String favorite) {
        this.name = name;
        this.favorite = favorite;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

}

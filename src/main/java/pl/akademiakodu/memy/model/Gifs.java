package pl.akademiakodu.memy.model;

/**
 * Created by macie on 02.08.2017.
 */
public class Gifs {
    private String name;
    private boolean favorite;

    public Gifs() {
    }


    public Gifs(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

}

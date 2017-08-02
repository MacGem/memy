package pl.akademiakodu.memy.model;

/**
 * Created by macie on 02.08.2017.
 */
public class Gifs {
    private String name;
    private boolean favorite;

    private Long id;

    public Gifs(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

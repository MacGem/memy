package pl.akademiakodu.memy.model;

/**
 * Created by Damian on 02.08.2017.
 */
public class Gif {

    private String name;
    private String favorite;

    public Gif(){
    }

    public Gif(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

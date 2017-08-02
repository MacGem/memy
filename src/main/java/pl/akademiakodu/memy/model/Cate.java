package pl.akademiakodu.memy.model;

/**
 * Created by macie on 02.08.2017.
 */
public class Cate {
    private String name;
    private Long id;

    public Cate(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

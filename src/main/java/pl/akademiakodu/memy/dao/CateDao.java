package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Cate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macie on 02.08.2017.
 */
public class CateDao implements ShowCate {
    static List<Cate> cates= new ArrayList<>();

    static {
        cates.add(new Cate("Zwierze", 1L));
        cates.add(new Cate("Czolg", 2L));
        cates.add(new Cate("Dupapsia", 3L));

    }

    @Override
    public List<Cate> showCate() {
        return cates;
    }
}

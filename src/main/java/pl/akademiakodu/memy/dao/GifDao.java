package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damian on 02.08.2017.
 */
public class GifDao {

    static List<Gif> gifs = new ArrayList<>();
    static{
        gifs.add(new Gif());
    }
}

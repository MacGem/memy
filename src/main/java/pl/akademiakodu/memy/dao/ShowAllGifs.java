package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gifs;

import java.util.List;


/**
 * Created by macie on 02.08.2017.
 */
public interface ShowAllGifs {

    List<Gifs> showall();

    List<Gifs> showfav();

}

package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gifs;

import java.util.List;

import static pl.akademiakodu.memy.dao.GifsDao.gifs;

/**
 * Created by macie on 02.08.2017.
 */
public interface ShowAllGifs {

    List<Gifs> showall();
    //        return gifs;

    List<Gifs> showfav();
}

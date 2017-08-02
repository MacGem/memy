package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Article;
import pl.akademiakodu.memy.model.Gifs;
import sun.net.www.content.image.gif;

import java.util.ArrayList;
import java.util.List;

import static pl.akademiakodu.memy.dao.ArticleDaoImpl.articles;

/**
 * Created by macie on 02.08.2017.
 */
public class GifsDao {
    static List<Gifs> gifs = new ArrayList<>();

    static {
        gifs.add(new Gifs("android-explosion"));
        gifs.add(new Gifs("ben-and-mike"));
        gifs.add(new Gifs("book-dominos"));
        gifs.add(new Gifs("compiler-bot"));
        gifs.add(new Gifs("cowboy-coder"));
        gifs.add(new Gifs("infinite-andrew"));
    }

    public List<Gifs> showall(){
        return gifs;
    }
}

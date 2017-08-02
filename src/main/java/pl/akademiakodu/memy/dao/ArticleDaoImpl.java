package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macie on 02.08.2017.
 */
public class ArticleDaoImpl {

    static List<Article> articles = new ArrayList<>();

    static {
        articles.add(new Article("aaaaa", "bbbb"));
        articles.add(new Article("mmm", "dddddd"));
        articles.add(new Article("Jjjjjjjj", "Www"));
        articles.add(new Article("uyuyuy", "eeeee"));
        articles.add(new Article("Waaak", "Alfaaaaa"));
    }

}

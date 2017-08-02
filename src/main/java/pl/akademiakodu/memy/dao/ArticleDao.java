package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damian on 02.08.2017.
 */
public class ArticleDao {

    private static List<Article> articles = new ArrayList<>();

    static{
        articles.add(new Article("Jan", "Kowalski"));
        articles.add(new Article("Piotr", "Nowak"));
        articles.add(new Article("Zdzisław", "Python"));
        articles.add(new Article("Józef", "Nowak"));
    }
}

package pl.akademiakodu.memy.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.memy.model.Article;

/**
 * Created by Damian on 02.08.2017.
 */
public class ArticleController {


    @GetMapping("/article")
    public String add() {
        return "article/add";
    }

    @GetMapping("/show")
    public String show(@ModelAttribute Article article, ModelMap modelMap) {
        modelMap.addAttribute("article", article);
        return "article/show";
    }
}

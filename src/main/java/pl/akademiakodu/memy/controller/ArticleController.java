package pl.akademiakodu.memy.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.memy.model.Article;


@Controller
public class ArticleController {

    @GetMapping("/show")
    public String show(@ModelAttribute Article article, ModelMap modelMap){
        modelMap.addAttribute("articles", article);
        return "article/show";
    }
}


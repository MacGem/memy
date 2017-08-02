package pl.akademiakodu.memy.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.model.Article;

/**
 * Created by Damian on 02.08.2017.
 */
@Controller
public class GifController {

    GifDao gifDao = new GifDao();

    @GetMapping("/showgif")
    public String show(ModelMap modelMap){
        //modelMap.addAttribute("articles");
        return "home";
    }

}

package pl.akademiakodu.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.memy.dao.CateDao;
import pl.akademiakodu.memy.dao.GifsDao;
import pl.akademiakodu.memy.model.Cate;
import pl.akademiakodu.memy.model.Gifs;
import sun.net.www.content.image.gif;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macie on 02.08.2017.
 */
@Controller
public class GifsController {
    GifsDao gifDao = new GifsDao();
    CateDao cateDao = new CateDao();

    @GetMapping("/")
    public String hello( ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDao.showall());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorite( ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDao.showfav());
        return "favorites";
    }

    @GetMapping("/categories")
    public String categories( ModelMap modelMap){
        modelMap.addAttribute("categories", cateDao.showCate());
        return "categories";
    }

    @GetMapping("/gifs/search")
    public String search(@RequestParam String q, ModelMap modelMap){
        List<Gifs> gifses = new ArrayList<Gifs>();
        gifses.add(gifDao.findName(q));
        modelMap.addAttribute("gifs", gifses);
        return "home";
    }

}

package pl.akademiakodu.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.memy.dao.CateDao;
import pl.akademiakodu.memy.dao.GifsDao;
import pl.akademiakodu.memy.model.Cate;

/**
 * Created by macie on 02.08.2017.
 */
@Controller
public class GifsController {
    GifsDao gifDao = new GifsDao();
    CateDao cateDao = new CateDao();

//    @GetMapping("/showgifs")
//    public String show( ModelMap modelMap){
//        return "home";
//    }
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

//    @RequestMapping("/getPhoto/{id}")
//    public @ResponseBody
//    byte[] getPhoto(@PathVariable("id") final String id) throws IOException {
//        byte[] imageBytes = dao.getImage(id);
//        return imageBytes;
//    }
}

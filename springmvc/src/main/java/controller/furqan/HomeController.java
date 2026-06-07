package controller.furqan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/first")
public class HomeController {
@RequestMapping(path = "/home",   method= RequestMethod.GET)
    public String home(Model model){
    System.out.println("This is Home url");
    model.addAttribute("name","Furqan Ahmad");
    model.addAttribute("id",45);
    List<String> friends=new ArrayList<>();
    friends.add("anas");
    friends.add("meraj");
    friends.add("hamza");
    friends.add("Zehra");
    friends.add("A to Z");
    model.addAttribute("friends",friends);

    return "index";
    }
    @RequestMapping("/about")
    public String about(){
    return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("help controller");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","Furqan");
        modelAndView.addObject("Rollnumber",5454);
       LocalDateTime now= LocalDateTime.now();
       modelAndView.addObject("time",now);
       List<Integer> list=new ArrayList<>();
       list.add(54);
       list.add(87);
       list.add(58);
       list.add(84);
       modelAndView.addObject("marks",list);

        modelAndView.setViewName("help");

        return modelAndView;
    }

}

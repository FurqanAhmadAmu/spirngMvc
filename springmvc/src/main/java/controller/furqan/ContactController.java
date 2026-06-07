package controller.furqan;

import controller.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
   @Autowired
    private UserService userService;
    @ModelAttribute
    public void commanDataForModel(Model model){
        model.addAttribute("Header","Learn Code with Furqan");
        model.addAttribute("Desc","Home for programmer");
        System.out.println("Adding comman data ");


    }
    @RequestMapping(path="/contacts",method = RequestMethod.GET)
    public String showForm(Model  model){
        System.out.println("creating form");
        return "contacts";
    }

//@RequestMapping(path="/processform",method = RequestMethod.POST)
//    public String handleForm(HttpServletRequest request){
//        String emailId=request.getParameter("email");
//    System.out.println(emailId);
//        return "";
//}

    @RequestMapping(path ="/processform",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model){
        if (user.getUsername().isBlank())
            return "redirect:/contacts";
        System.out.println(user);
      int createduser=  this.userService.creatUser(user);
      model.addAttribute("msg","User created with Id "+createduser);
        return "success";

    }
//    @RequestMapping(path ="/processform",method = RequestMethod.POST)
//    public String handleForm(@RequestParam("email") String userEmail,
//                             @RequestParam("username") String username,
//                             @RequestParam("password") String password, Model model){
////        System.out.println(userEmail);
////        System.out.println(username);
////        System.out.println(password);
//        User user =new User();
//        user.setEmail(userEmail);
//        user.setUsername(username);
//        user.setPassword(password);
//        System.out.println(user);
//        model.addAttribute("user",user);
//
//
//
////        model.addAttribute("email",userEmail);
////        model.addAttribute("name",username);
////        model.addAttribute("password",password);
//
//        return "success";
//
//    }
}

package res.restaurant.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import res.restaurant.model.BookingTable;
import res.restaurant.service.BookingRepo;

@Controller
public class HomeController {

    @Autowired
    private BookingRepo bookingRepo;

    @GetMapping("/")
    public String index2(Model model){
        model.addAttribute("booking", new BookingTable());
        return "index";
    }
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("booking", new BookingTable());
        return "index";
    }

    @PostMapping("/save")
    public String save (@ModelAttribute BookingTable bookingTable){
        bookingRepo.save(bookingTable);
        return "redirect:index";
    }
}

package res.restaurant.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import res.restaurant.model.BookingTable;
import res.restaurant.service.BookingRepo;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private BookingRepo bookingRepo;

    @GetMapping("/")
    public String index2(Model model){
        model.addAttribute("booking", new BookingTable());
        model.addAttribute("allOrders",bookingRepo.findAll());
        return "index";
    }

    @PostMapping("/save")
    public String save (@ModelAttribute @Valid BookingTable bookingTable, BindingResult result){
        if(result.hasErrors())
        {
            return "redirect:/";
        }
        bookingRepo.save(bookingTable);
        return "redirect:/";
    }
}

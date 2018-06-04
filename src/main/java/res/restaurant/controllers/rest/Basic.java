package res.restaurant.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import res.restaurant.model.BookingTable;
import res.restaurant.service.BookingRepo;

import java.util.List;

@RestController
public class Basic {

    @Autowired
    private BookingRepo bookingRepo;

    @GetMapping("/show")
    public List<BookingTable> show(){
        return bookingRepo.findAll();
    }
}

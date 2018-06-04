package res.restaurant.service;

import org.springframework.data.jpa.repository.JpaRepository;
import res.restaurant.model.BookingTable;

public interface BookingRepo extends JpaRepository<BookingTable,Long>{

}

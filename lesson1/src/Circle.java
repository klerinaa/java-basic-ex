
Of course! Here are the entity classes for Customer, Room, and Reservation:

        Customer.java
        java
        Copy code
import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Constructor, getters, and setters
}
    Room.java
            java
    Copy code
import javax.persistence.*;

        import javax.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNumber;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;

    // getters and setters
}
In this update, we introduced an enumeration called RoomStatus to represent the status of the room. It could have values like AVAILABLE, OCCUPIED, UNDER_MAINTENANCE, etc., depending on your specific requirements.

        Updated Reservation.java Entity
        java
        Copy code
        import javax.persistence.*;
        import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    private Date checkInDate;
    private Date checkOutDate;

    // getters and setters
}


    CustomerRepository.java
            java
    Copy code
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
    RoomRepository.java
            java
    Copy code
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
    ReservationRepository.java
            java
    Copy code
import org.springframework.data.jpa.repository.JpaRepository;
        import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByCustomerName(String customerName);
}
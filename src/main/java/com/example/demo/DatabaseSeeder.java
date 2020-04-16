package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;
    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository=bookingRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        List<HotelBooking> bookings = new ArrayList<>();
        bookings.add(new HotelBooking("Hilton", 400, 2));
        bookings.add(new HotelBooking("Grand", 305.50, 1));
        bookings.add(new HotelBooking("Marriott", 205, 5));
        bookings.add(new HotelBooking("Marriott2", 75, 5));

        bookingRepository.saveAll(bookings);
    }
}

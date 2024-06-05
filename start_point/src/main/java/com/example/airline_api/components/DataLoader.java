package com.example.airline_api.components;

import com.example.airline_api.models.Booking;
import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.BookingRepository;
import com.example.airline_api.services.FlightService;
import com.example.airline_api.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PassengerService passengerService;

    @Autowired
    FlightService flightService;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{
        //flights
        Flight miami = new Flight("Miami", 200, "12/06/2564", "01:00");
        flightService.saveFlight(miami);
        Flight hawaii = new Flight("Hawaii", 100, "15/06/2564", "02:00");
        flightService.saveFlight(hawaii);
        Flight singapore = new Flight("Singapore", 150, "02/06/2564", "13:00");
        flightService.saveFlight(singapore);

        //passengers
        Passenger charisma = new Passenger("Charisma", "charisma@outlook.com");
        passengerService.savePassenger(charisma);
        Passenger robbie = new Passenger("Robbie", "robbiemcilwaine99@gmail.com");
        passengerService.savePassenger(robbie);
        Passenger dan = new Passenger("Danash", "danashmahmood@yahoo.com");
        passengerService.savePassenger(dan);

        //bookings
        Booking booking = new Booking(miami, charisma, 12);
        bookingRepository.save(booking);
        Booking booking1 = new Booking(hawaii, robbie, 1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking(singapore, dan, 38);
        bookingRepository.save(booking2);



    }
}

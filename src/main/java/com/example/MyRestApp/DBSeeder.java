package com.example.MyRestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    @Autowired
    HotelRepository hotelRepository;


    @Override
    public void run(String... args) throws Exception {
        Hotel hilton = new Hotel("Hilton",
                1240,
                new Address("Argentina", "Buenos Aires"),
                Arrays.asList(
                     new Review("doe",8,true),
                        new Review("dummy",4,false)
                )
        );
        Hotel marriot = new Hotel("Marriot",
                1240,
                new Address("USA", "Dallas"),
                Arrays.asList(
                        new Review("data",7,true),
                        new Review("someUser",4,false),
                          new Review("doe",8,true)
                )
        );
        Hotel hostel = new Hotel("hostel",
                1240,
                new Address("Argentina", "Mendonza"),
                Arrays.asList(
                        new Review("data",3,false),
                        new Review("doe",8,true)
                )
        );

      this.hotelRepository.deleteAll();

      List<Hotel>hotels =Arrays.asList(marriot,hostel,hilton);
      this.hotelRepository.saveAll(hotels);


    }
}

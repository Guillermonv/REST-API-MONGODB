package com.example.MyRestApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spark.Request;
import spark.Response;

import java.util.List;
import java.util.Optional;

import static spark.Spark.get;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelRepository hotelRepository;


    @GetMapping("/all")
   public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }

    //Expand for example json object example to do POST request
    /*
    {
        "name": "Guille House",
            "pricePerNight": 12040,
            "address": {
        "country": "Argentina",
                "city": "Quequen"
    },
        "reviews": [
        {
            "username": "data",
                "score": 7,
                "approve": true
        },
        {
            "username": "someUser",
                "score": 4,
                "approve": false
        },
        {
            "username": "doe",
                "score": 8,
                "approve": true
        }
        ]
    }
    */
    @PostMapping("/save")
    public void saveHotel(@RequestBody Hotel hotel){
         hotelRepository.save(hotel);

    }

    @DeleteMapping("/del")
    public void deleteHotel( String hotelID){
        hotelRepository.deleteById(hotelID);
    }
/*SPARK java framework TBD
    public void v1deleteHotel(Request request , Response response){
    get("/v1/del/:id", (request1, response1)-> {
       hotelRepository.deleteById(request.params(":id"));
        return "Ok";
    });
    }
    */
    @PutMapping("/update")
    public void updateHotel(@RequestBody Hotel hotel ){
        Optional<Hotel> forupdate =hotelRepository.findById(hotel.getId());
        hotelRepository.save(hotel);
    }

}

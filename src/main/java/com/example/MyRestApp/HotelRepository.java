package com.example.MyRestApp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {


}

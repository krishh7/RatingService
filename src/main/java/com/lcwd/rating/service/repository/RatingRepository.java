package com.lcwd.rating.service.repository;

import com.lcwd.rating.service.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String> {

    //Custom find methods
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);

}

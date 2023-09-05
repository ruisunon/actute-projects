package com.jat.UserService.external.services;

import com.jat.UserService.entities.Hotel;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "HOTEL-SERVICE",url="${HOTEL-SERVICE}")
@Service
public interface HotelService
{
@GetMapping("/hotels/{hotelId}")
    public Hotel getHotel(@PathVariable("hotelId") String hotelId);


}


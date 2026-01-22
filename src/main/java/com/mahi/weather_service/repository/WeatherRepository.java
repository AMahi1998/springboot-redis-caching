package com.mahi.weather_service.repository;

import com.mahi.weather_service.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

    Optional<Weather> findByCity(String city);

    void deleteByCity(String city);
}
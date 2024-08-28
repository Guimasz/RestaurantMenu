package com.example.RestaurantMenuAPI.controller;


import com.example.RestaurantMenuAPI.food.Food;
import com.example.RestaurantMenuAPI.food.FoodRequestDTO;
import com.example.RestaurantMenuAPI.food.FoodResponseDTO;
import com.example.RestaurantMenuAPI.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;


    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){
        //métodos de stream e map usam o construtor de FoodDTO pra criar um DTO correspondente pra cada objeto food no repository
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;

    }








}

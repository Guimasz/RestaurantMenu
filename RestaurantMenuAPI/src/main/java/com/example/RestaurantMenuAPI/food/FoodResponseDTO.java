package com.example.RestaurantMenuAPI.food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {

    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());//construtor usa atributos de food pra contruir um foodDTO
    }


}

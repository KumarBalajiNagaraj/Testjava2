package com.example.fruitstall.service;

import com.example.fruitstall.model.Fruit;
import com.example.fruitstall.model.FruitStall;

import java.util.List;

public interface FriendFruitService {
    List<Fruit> getAvailableFruits();
    FruitStall getRemainingFruitStall(List<FruitStall> fruitStalls);
    double getTotalPrice(List<Fruit> fruits);
    List<FruitStall> getAllFruitStalls();
}

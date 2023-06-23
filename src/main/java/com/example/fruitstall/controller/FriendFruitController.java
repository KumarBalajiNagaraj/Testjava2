package com.example.fruitstall.controller;

import com.example.fruitstall.model.Fruit;
import com.example.fruitstall.model.FruitStall;
import com.example.fruitstall.service.FriendFruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/friend")
public class FriendFruitController {
    private final FriendFruitService friendFruitService;

    @Autowired
    public FriendFruitController(FriendFruitService friendFruitService) {
        this.friendFruitService = friendFruitService;
    }

    @GetMapping("/available-fruits")
    public List<Fruit> getAvailableFruits() {
        return friendFruitService.getAvailableFruits();
    }

    @GetMapping("/remaining-fruit-stall")
    public FruitStall getRemainingFruitStall() {
        List<FruitStall> fruitStalls = friendFruitService.getAllFruitStalls();
        return friendFruitService.getRemainingFruitStall(fruitStalls);
    }

    @GetMapping("/total-price")
    public double getTotalPrice() {
        List<Fruit> fruits = friendFruitService.getAvailableFruits();
        return friendFruitService.getTotalPrice(fruits);
    }
}

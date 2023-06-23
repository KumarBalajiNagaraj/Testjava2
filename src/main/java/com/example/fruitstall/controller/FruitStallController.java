package com.example.fruitstall.controller;

import com.example.fruitstall.model.FruitStall;
import com.example.fruitstall.service.FruitStallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pelle-kajsa")
public class FruitStallController {
    private final FruitStallService fruitStallService;

    @Autowired
    public FruitStallController(FruitStallService fruitStallService) {
        this.fruitStallService = fruitStallService;
    }

    @GetMapping("/optimal-fruit-stall")
    public FruitStall getOptimalFruitStall() {
        return fruitStallService.getOptimalFruitStall();
    }

    @GetMapping("/total-price")
    public double getTotalPrice() {
        FruitStall fruitStall = fruitStallService.getOptimalFruitStall();
        return fruitStallService.getTotalPrice(fruitStall);
    }
}

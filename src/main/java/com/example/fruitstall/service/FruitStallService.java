package com.example.fruitstall.service;

import com.example.fruitstall.model.FruitStall;

import java.util.List;

public interface FruitStallService {
    FruitStall getOptimalFruitStall();
    double getTotalPrice(FruitStall fruitStall);
}

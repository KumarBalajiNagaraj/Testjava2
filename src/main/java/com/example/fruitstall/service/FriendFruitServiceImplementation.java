package com.example.fruitstall.service;

import com.example.fruitstall.dao.FruitStallDAO;
import com.example.fruitstall.model.Fruit;
import com.example.fruitstall.model.FruitStall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendFruitServiceImplementation implements FriendFruitService {
    private final FruitStallDAO fruitStallDAO;

    @Autowired
    public FriendFruitServiceImplementation(FruitStallDAO fruitStallDAO) {
        this.fruitStallDAO = fruitStallDAO;
    }

    @Override
    public List<Fruit> getAvailableFruits() {
        List<FruitStall> fruitStalls = fruitStallDAO.getAllFruitStalls();
        List<Fruit> availableFruits = new ArrayList<>();

        for (FruitStall fruitStall : fruitStalls) {
            if (fruitStall.isHasCherry() && !availableFruits.contains(fruitStall.getCherry()))
                availableFruits.add(fruitStall.getCherry());
            if (fruitStall.isHasPeach() && !availableFruits.contains(fruitStall.getPeach()))
                availableFruits.add(fruitStall.getPeach());
            if (fruitStall.isHasPear() && !availableFruits.contains(fruitStall.getPear()))
                availableFruits.add(fruitStall.getPear());
        }

        return availableFruits;
    }
    @Override
    public List<FruitStall> getAllFruitStalls() {
        return fruitStallDAO.getAllFruitStalls();
    }

    @Override
    public FruitStall getRemainingFruitStall(List<FruitStall> fruitStalls) {
        FruitStall remainingFruitStall = null;

        for (FruitStall fruitStall : fruitStalls) {
            if (!fruitStall.isHasPear()) {
                remainingFruitStall = fruitStall;
                break;
            }
        }

        return remainingFruitStall;
    }

    @Override
    public double getTotalPrice(List<Fruit> fruits) {
        double totalPrice = 0;

        for (Fruit fruit : fruits) {
            totalPrice += fruit.getPrice();
        }

        return totalPrice;
    }
}

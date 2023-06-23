package com.example.fruitstall.service;

import com.example.fruitstall.dao.FruitStallDAO;
import com.example.fruitstall.model.FruitStall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitStallServiceImplementation implements FruitStallService {
    private final FruitStallDAO fruitStallDAO;

    @Autowired
    public FruitStallServiceImplementation(FruitStallDAO fruitStallDAO) {
        this.fruitStallDAO = fruitStallDAO;
    }

    @Override
    public FruitStall getOptimalFruitStall() {
        List<FruitStall> fruitStalls = fruitStallDAO.getAllFruitStalls();
        FruitStall optimalFruitStall = null;
        double lowestPrice = Double.MAX_VALUE;

        for (FruitStall fruitStall : fruitStalls) {
            if (fruitStall.isHasPear()) {
                double totalPrice = getTotalPrice(fruitStall);
                if (totalPrice < lowestPrice) {
                    lowestPrice = totalPrice;
                    optimalFruitStall = fruitStall;
                }
            }
        }

        return optimalFruitStall;
    }

    @Override
    public double getTotalPrice(FruitStall fruitStall) {
        double totalPrice = 0;

        if (fruitStall != null) {
            if (fruitStall.isHasCherry())
                totalPrice += fruitStall.getCherry().getPrice();
            if (fruitStall.isHasPeach())
                totalPrice += fruitStall.getPeach().getPrice();
            if (fruitStall.isHasPear())
                totalPrice += fruitStall.getPear().getPrice();
        }

        return totalPrice;
    }
}

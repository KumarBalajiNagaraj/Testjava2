package com.example.fruitstall.dao;

import com.example.fruitstall.model.FruitStall;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FruitStallDAO {
    List<FruitStall> getAllFruitStalls();
    void updateFruitStall(FruitStall fruitStall);
}

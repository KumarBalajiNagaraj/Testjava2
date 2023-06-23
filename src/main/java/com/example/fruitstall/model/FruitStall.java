package com.example.fruitstall.model;
public class FruitStall {
    private boolean hasCherry;
    private boolean hasPeach;
    private boolean hasPear;
    private Fruit cherry;
    private Fruit peach;
    private Fruit pear;

    // Getters and setters

    public boolean isHasCherry() {
        return hasCherry;
    }

    public void setHasCherry(boolean hasCherry) {
        this.hasCherry = hasCherry;
    }

    public boolean isHasPeach() {
        return hasPeach;
    }

    public void setHasPeach(boolean hasPeach) {
        this.hasPeach = hasPeach;
    }

    public boolean isHasPear() {
        return hasPear;
    }

    public void setHasPear(boolean hasPear) {
        this.hasPear = hasPear;
    }

    public Fruit getCherry() {
        return cherry;
    }

    public void setCherry(Fruit cherry) {
        this.cherry = cherry;
    }

    public Fruit getPeach() {
        return peach;
    }

    public void setPeach(Fruit peach) {
        this.peach = peach;
    }

    public Fruit getPear() {
        return pear;
    }

    public void setPear(Fruit pear) {
        this.pear = pear;
    }
}

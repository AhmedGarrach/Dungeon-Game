package com.ahmed.dungeon.entities;

public abstract class Item extends Entity {
    private int weight;
    public Item(String name, char symbol, int x, int y, int weight)
    {
        super(name,symbol,x,y);
        this.weight = weight;
    }
    public int getWeight(){return weight;}
}

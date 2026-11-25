package com.ahmed.dungeon.entities;

public class Potion extends Item {
    private int regen;
    public Potion(String name, char symbol, int x, int y, int regen)
    {
        super(name,symbol,x,y,2);//all potions have a weight of 2
        this.regen = regen;
    }
    public int getRegen(){return regen;}
}

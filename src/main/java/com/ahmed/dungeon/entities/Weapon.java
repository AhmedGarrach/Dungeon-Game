package com.ahmed.dungeon.entities;

public class Weapon extends Item {
    private int bonus;
    public Weapon(String name, char symbol, int x, int y, int weight,int bonus)
    {
        super(name,symbol,x,y,weight);
        this.bonus = bonus;
    }
    public int getBonus(){return bonus;}

}

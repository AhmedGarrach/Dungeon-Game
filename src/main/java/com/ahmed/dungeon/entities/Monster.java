package com.ahmed.dungeon.entities;

public abstract class Monster extends Creature{
    private int xp;
    public Monster(String name,char symbol,int x,int y,int maxhp,int damage,int defense,int xp)
    {
        super(name,symbol,x,y,maxhp,damage,defense);
        this.xp = xp;
    }
}

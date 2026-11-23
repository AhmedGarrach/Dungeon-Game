package com.ahmed.dungeon.entities;

public abstract class Creature extends Entity {
    int hp;
    int maxhp;
    int damage;
    int defense;
    public Creature(String name,char symbol,int x,int y,int maxhp,int damage,int defense)
    {
        super(name,symbol,x,y);
        this.maxhp = maxhp;
        hp = maxhp;
        this.damage = damage;
        this.defense = defense;
    }
    public void move(int dx, int dy)
    {
        setPosition(getX()+dx, getY()+dy);
    }
    
}

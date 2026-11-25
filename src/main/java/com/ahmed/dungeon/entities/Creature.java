package com.ahmed.dungeon.entities;

public abstract class Creature extends Entity implements Damageable {
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
    public void takeDamage(int damage)
    {
        if(hp-damage<0)hp=0;
        else hp-=damage;
    }
    public void heal(int h)
    {
        if(hp+h>maxhp)h=maxhp;
        else hp+=h;
    }
    public boolean isAlive(){return hp==0;}
    public int getHp(){return hp;}
}

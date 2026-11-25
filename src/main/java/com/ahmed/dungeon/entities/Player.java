package com.ahmed.dungeon.entities;

public class Player extends Creature {

    public Player(String name,int x,int y,int maxhp,int damage,int defense)
    {
        super(name,'@',x,y,maxhp,damage,defense);
    
    }
    public void equipWeapon(Weapon w){damage += w.getBonus();}
}

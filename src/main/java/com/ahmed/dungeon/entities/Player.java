package com.ahmed.dungeon.entities;

public class Player extends Creature {
    private Weapon weapon = null;
    public Player(String name,int x,int y,int maxhp,int damage,int defense)
    {
        super(name,'@',x,y,maxhp,damage,defense);
    
    }
    public void equipWeapon(Weapon w){weapon = w;}
    public void usePotion(Potion p){heal(p.getRegen());}
}

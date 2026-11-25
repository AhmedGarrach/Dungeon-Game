package com.ahmed.dungeon.entities;

public interface Damageable {
    public void takeDamage(int damage);
    public void heal(int hp);
    public boolean isAlive();
    public int getHp();
}
package com.ahmed.dungeon.entities;

public abstract class Entity {
    private final String name;
    private final char symbol;
    private int x;
    private int y;
    public Entity(String name,char symbol, int x,int y)
    {
        this.name=name;
        this.symbol = symbol;
        this.x=x;
        this.y=y;
    }
    public String getName(){return name;}
    public char getSymbol(){return symbol;}
    public int getX(){return x;}
    public int getY(){return y;}
    public String getPosition(){return "("+x+","+y+")";}
    public void setPosition(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}

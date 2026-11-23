package com.ahmed.dungeon.ui;

public class TerminalRender implements Renderer {
    @Override
    public void showMsg(String msg)
    {
        System.out.println(msg);
    }
}

package com.sevendaystodie.trainer;

public class Main {
    public static void main(String[] args) {
        System.out.println("7 Days to Die Trainer v1.0.0");
        MemoryEditor editor = new MemoryEditor();
        GameHack hack = new GameHack(editor);
        hack.activateGodMode();
        hack.setPlayerHealth(250.0f);
        hack.setPlayerStamina(200.0f);
        System.out.println("Trainer applied successfully.");
    }
}
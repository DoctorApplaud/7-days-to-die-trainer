package com.sevendaystodie.trainer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameHackTest {
    @Test
    public void testActivateGodMode() {
        MemoryEditor editor = new MemoryEditor();
        GameHack hack = new GameHack(editor);
        hack.activateGodMode();
        Object value = editor.read("0x7D2D001");
        assertEquals(1, value);
    }

    @Test
    public void testSetPlayerHealth() {
        MemoryEditor editor = new MemoryEditor();
        GameHack hack = new GameHack(editor);
        hack.setPlayerHealth(250.0f);
        Object value = editor.read("0x7D2D010");
        assertEquals(250.0f, (Float) value, 0.001);
    }

    @Test
    public void testSetPlayerStamina() {
        MemoryEditor editor = new MemoryEditor();
        GameHack hack = new GameHack(editor);
        hack.setPlayerStamina(200.0f);
        Object value = editor.read("0x7D2D020");
        assertEquals(200.0f, (Float) value, 0.001);
    }
}
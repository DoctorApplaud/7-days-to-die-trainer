package com.sevendaystodie.trainer;

import java.util.HashMap;
import java.util.Map;

public class MemoryEditor {
    private final Map<String, Object> memoryMap = new HashMap<>();

    public void writeFloat(String address, float value) {
        memoryMap.put(address, value);
        System.out.println("Written float " + value + " to address " + address);
    }

    public void writeInt(String address, int value) {
        memoryMap.put(address, value);
        System.out.println("Written int " + value + " to address " + address);
    }

    public Object read(String address) {
        return memoryMap.get(address);
    }
}
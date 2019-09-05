package com.plain.java.programs;

public class StringtoStringBuffer {

    public static String name = "Tomorrow (24 Dec), I'm on PTO";

    public static void main(String[] args) {
        StringtoStringBuffer stringtoStringBuffer = new StringtoStringBuffer();
        stringtoStringBuffer.modifyName(name);
    }

    private String modifyName(String name) {

        StringBuilder sb = new StringBuilder(name);
        
        return null;
    }

}
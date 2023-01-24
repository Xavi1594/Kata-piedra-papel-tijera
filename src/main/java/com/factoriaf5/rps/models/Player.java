package com.factoriaf5.rps.models;

public class Player {

    public Figure choose(String string) {
     if (string == "Rock") {
        return new Rock();
     }
     return null;
    }

}
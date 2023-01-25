package com.factoriaf5.rps.models;

public class Player {

    public Figure choose(String string) {
     if (string == "Rock") {
        return new Rock();
     }
     if (string == "Paper") {
        return new Paper();
    }
    if (string == "Scissors") {
        return new Scissors();

}
return null;
    }
}
package com.factoriaf5.rps.models;

public class Player {

    private Figure figure;

    public Figure choose(String string) {
        if (string.equalsIgnoreCase("rock")) {
            return new Rock();
        } else if (string.equalsIgnoreCase("paper")) {
            return new Paper();
        } else if (string.equalsIgnoreCase("scissors")) {
            return new Scissors();
        } else {
            return null;
        }
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}

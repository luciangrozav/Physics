package org.fasttrackit;

public class Planet {

    private String name;  // Encapsulation used => private data
    private int positionfromstar;
    private double timeperiod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositionfromstar() {
        return positionfromstar;
    }

    public void setPositionfromstar(int positionfromstar) {
        this.positionfromstar = positionfromstar;
    }

    public double getTimeperiod() {
        return timeperiod;
    }

    public void setTimeperiod(double timeperiod) {
        this.timeperiod = timeperiod;
    }
}

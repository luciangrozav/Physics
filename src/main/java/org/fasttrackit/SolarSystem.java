package org.fasttrackit;

public class SolarSystem {

    Planet planet1 = new Planet();

    private void initialisePlanet()
    {
        planet1.setName("Earth");
        planet1.setPositionfromstar(3);
        planet1.setTimeperiod(8736); // hours per year

        System.out.println(" ");
        System.out.println("Name of the planet: " + planet1.getName());
        System.out.println("Number of planet from center star: " + planet1.getPositionfromstar() );
    }

    public void start()
    {
        initialisePlanet();
        elipticalorbit(planet1.getTimeperiod());
    }

    private void elipticalorbit(double timeperiod)  // Axis length
    {
        double number = 2* timeperiod * timeperiod;
        double axislength;
        axislength = squarerootbase3(number);  // 3rd law of Johannes Kepler
        System.out.println("The eliptical orbital axis length is: " + axislength);

    }

    private double squarerootbase3(double number)
    {
        double i=1;
        double j=1;

        if (number==0 || number==1)
            return number;

        while(j<number)
        {
            j=i*i*i;
            i++;
        }
        i-=1;

    return i;
    }


}

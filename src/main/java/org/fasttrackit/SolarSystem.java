package org.fasttrackit;

public class SolarSystem {

    Planet planet1 = new Planet();

    private void initialisePlanet()
    {
        planet1.setName("Earth");
        planet1.setPositionfromstar(3);
        planet1.setTimeperiod(31449600); // seconds per year

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
        double axislength;
        axislength = squarerootbase3(2* timeperiod * timeperiod);  // meters
        System.out.println(2* timeperiod * timeperiod);
        System.out.println("The eliptical orbital axis length is: " + axislength/1000);

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

    return i-1;
    }


}

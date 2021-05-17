package org.fasttrackit;

public class SolarSystem {

    Planet planet1 = new Planet();

    private void initialisePlanet()
    {
        planet1.setName("Earth");
        planet1.setPositionfromstar(3);
        planet1.setTimeperiod(31449600); // seconds per year
    }

    public void start()
    {
        initialisePlanet();
        elipticalorbit(planet1.getTimeperiod());
    }

    public void elipticalorbit(int timeperiod)  // Axis length
    {
        double axislength;
        axislength = squarerootbase( 125 , 3);  // meters
        System.out.println(" The eliptical orbital axis length is: " + axislength);

    }

    private double squarerootbase(int number, int base)
    {
        double i=1;
        int j=1;

        if (number==0 || number==1)
            return number;

        while(i!=number)
            {
                i+=0.1;

                while(j<=base)
                {
                    i*=i;
                    j++;
                }

            }
    return i;
    }


}

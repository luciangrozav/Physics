package org.fasttrackit;

import java.util.Scanner;

public class PhysicalLaws {

   Scanner scanner = new Scanner(System.in);

    double lightspeed;
    double lightspeedsecondmedium;

    {
        lightspeed = 3 * Math.pow(10, 8);
    }

    public void start()
    {
        System.out.println("Please take in consideration that the density of the second medium is proportionate with the speed of light!");
        System.out.println("Choose the speed of light for the second medium (m/s): ");
        lightspeedsecondmedium = scanner.nextDouble();
        Snellslaw(lightspeedsecondmedium);

    }

    private void Snellslaw(double speed)
    {
        double refractionindex=1;

        refractionindex=lightspeed/speed;

        System.out.println("The refraction index is: " + refractionindex);
    }

}

package org.fasttrackit;

import java.util.Scanner;

public class PhysicalLaws implements PhysicsMethodInterface {

   Scanner scanner = new Scanner(System.in);

    double lightspeed;
    double lightspeedsecondmedium;

    {
        lightspeed = 3 * Math.pow(10, 8);
    }

    void start()
    {
        System.out.println("Please take in consideration that the density of the second medium is proportionate with the speed of light!");
        System.out.println("Choose the speed of light for the second medium (m/s): ");
        lightspeedsecondmedium = scanner.nextDouble();
        Snellslaw(lightspeedsecondmedium);

        wavelength();
        Braggslaw();
        Faradayslaw();

    }

    public void Snellslaw(double speed)
    {
        double refractionindex=1;

        refractionindex=lightspeed/speed;

        System.out.println("The refraction index is: " + refractionindex);
    }

    public void wavelength()
    {
        System.out.println("Calculating the wavelength!");
        System.out.println(" ");
        double lambda=0;
        double frequency=0;

        System.out.println("Choose the frequency of the wavelength: ");
        frequency = scanner.nextDouble();

        lambda = lightspeed/frequency;

        System.out.println(" ");
        System.out.println("Wavelength = " + lambda + "meters");
    }

    public void Braggslaw()
    {
        System.out.println(" ");
        System.out.println("Determing Williams Bragg law of X-ray diffraction, which is basic for the determination of crystal structure!");
        System.out.println("2*d*sin(light-incidence-angle) = n*lambda");
        double distance=0;
        double angle=0;
        int n;
        double lambda=0;
        double frequency=0;

        System.out.println("Choose the frequency of the wavelength: ");
        frequency = scanner.nextDouble();
        lambda = lightspeed/frequency;

        System.out.println("Choose the light angle of incidence: ");
        angle= scanner.nextDouble();

        double radian=Math.toRadians(angle);  // => Math.sin(radian)

        System.out.println("Choose the integer number n: ");
        n= scanner.nextInt();

        distance= (n*lambda)/(2*Math.sin(radian));

        System.out.println(" ");
        System.out.println("The distance between the atoms in the crystal structure is: " + distance);

    }

    public void Faradayslaw()
    {
        System.out.println(" ");
        System.out.println("The law of electromagnetic induction phenomenon!");

        double inducedvoltage=0;
        int numberofloops=0;
        double magneticflux=0;

        System.out.println("Number of wire loops: ");
        numberofloops= scanner.nextInt();

        System.out.println("Change in magnetic flux: ");
        magneticflux = scanner.nextDouble();

        inducedvoltage= numberofloops * magneticflux;

        System.out.println("The voltage induced in the device is: " + inducedvoltage + " Volts");

    }



}

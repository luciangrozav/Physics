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
        int n;
        System.out.println(" ");
        System.out.println("Choose an Maxwell equation (1, 2, 3 or 4) :");
        n = scanner.nextInt();
        MaxwellLaw(n);
        MaxPlanck();

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

    public void MaxwellLaw(int n)
    {
        if(n==1)
            System.out.println("I- Gauss law: dD = P -> gives information about the shape and intensity of the electric field, generated" +
                    "by an electric potential");
        if(n==2)
            System.out.println("II- Gauss law in magnetism: dB = 0 -> the shape of the magnetic field is always an closed loop");
        if (n==3 || n==4)
        {
            System.out.println("III and IV laws are related, they both refer to the eletromagnetic induction law");
        System.out.println("III: dE = - dB/dt -> a magnet can generate an electric curent through a wire" );
        System.out.println("IV: dH = dD/dt + J -> an electric current through a wire will generate a magnetic field");
        }
    }

    public void MaxPlanck()
    {
        double frequency;
        double energy;
        final double planckconstant = 6.626 * 0.00000000000000000000000000000001; // Joule * Hertz^-1
        System.out.println(" ");
        System.out.println("Choose the frequency of the photon: ");
        frequency = scanner.nextDouble();

        energy = planckconstant * frequency;
        System.out.println("The energy of the photon is: " + energy + " Joule");

    }



}

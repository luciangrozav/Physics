package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Physics lessons!" );

        SolarSystem game = new SolarSystem();
        game.start();
        System.out.println(" ");

        PhysicalLaws snell = new PhysicalLaws();
        snell.start();

    }
}

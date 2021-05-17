package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Physics lessons!" );
        System.out.println(" ");

        SolarSystem game = new SolarSystem();
        game.start();

    }
}

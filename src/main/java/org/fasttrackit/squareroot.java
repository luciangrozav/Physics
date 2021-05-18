package org.fasttrackit;

public class squareroot {

    public static void main(String[] args) {

        double number=8736 * 8736 * 2;
        double i=1;
        double j=1;

        if (number==0 || number==1)
            System.out.println(number);

        while(j<number)
        {

            j=i*i*i;
            i++;
        }
        i-=1;

        System.out.println(i + " " + j);
    }

}

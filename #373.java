package com.mycompany.aceptaelreto;
public class AceptaElReto { 

    static java.util.Scanner in;

    public static void casoDePrueba() {

        long N = in.nextInt();
       
        if ((2 <= N) &&  (N <= 1000000)) {
             long carasVisibles = ((6*(N-1)*(N-1))+2);
             System.out.println(carasVisibles); 
        }
    } // casoDePrueba

    public static void main(String args[]) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution

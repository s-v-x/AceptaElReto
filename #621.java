package com.mycompany.aceptaelreto;
public class AceptaElReto { 

    static java.util.Scanner in;

    public static void casoDePrueba() {

        int N = in.nextInt();
       
        if ((2 <= N) &&  (N <= 1000)) {
             if (N % 2 == 0) {
                 System.out.println(N+1);
             }
             else {
                 System.out.println(N-1);
             }
        }
        else {
            System.out.println();
        }
    } // casoDePrueba

    public static void main(String args[]) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution

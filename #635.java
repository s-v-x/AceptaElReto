package com.mycompany.aceptaelreto;

public class AceptaElReto { 

    static java.util.Scanner in;

    public static void casoDePrueba() {
      
        int numProblema = in.nextInt();
        int resultado;
        
        if (numProblema % 100 == 0) { 
            resultado = (numProblema/100);
        }
            
        else {
            resultado = (numProblema/100) + 1;
        }
        
        System.out.println(resultado); 

    } // casoDePrueba

    public static void main(String args[]) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution

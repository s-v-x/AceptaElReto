package com.mycompany.aceptaelreto;
public class AceptaElReto { 

    static java.util.Scanner in;

    public static void casoDePrueba() {

        int N = in.nextInt();
       
        if ((0 <= N) &&  (N <= 86400)) {
            int horas = (N/3600);
            N = (N-(horas*3600));
            
            int minutos = (N/60);
            N = (N-(minutos*60));
            
            int segundos = N;
            
                     
            String timeInHHMMSS = String.format("%02d:%02d:%02d", horas, minutos, segundos);
            System.out.println(timeInHHMMSS);
        }
        if (N>86400){
            System.out.println("24:00:00");
        }
    } // casoDePrueba

    public static void main(String args[]) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution

package com.mycompany.aceptaelreto;
import java.util.Scanner;

public class AceptaElReto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCasos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba(scanner);
        }
        
        scanner.close();
    }

    public static void casoDePrueba(Scanner scanner) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        int a, b, c;

        if (x > y) {
            if (x > z) {
                c = x;
                a = y;
                b = z;
            } else {
                c = z;
                a = y;
                b = x;
            }
        } else if (y > z) {
            c = y;
            a = x;
            b = z;
        } else {
            c = z;
            a = x;
            b = y;
        }

        if (a > 0 && a < 32767 && b > 0 && b < 32767 && c > 0 && c < 32767) {
            if (a + b > c) {
                if (a * a + b * b == c * c) {
                    System.out.println("RECTANGULO");
                } else if (a * a + b * b < c * c) {
                    System.out.println("OBTUSANGULO");
                } else if (a * a + b * b > c * c) {
                    System.out.println("ACUTANGULO");
                }
            } else {
                System.out.println("IMPOSIBLE");
            }
        } else {
            System.out.println("IMPOSIBLE");
        }
    }
}

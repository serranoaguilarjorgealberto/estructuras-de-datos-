package com.mycompany.ed3s6_prac;

import java.util.Scanner;

public class DetectaTipo<T, U> {

    T num1;
    U num2;

    public DetectaTipo(T num1, U num2) {

        this.num1 = num1;
        this.num2 = num2;

        Detecta();
    }

    private void Detecta() {

 
        if (num1 instanceof Integer && num2 instanceof Integer) {

            int n1 = (Integer) num1;
            int n2 = (Integer) num2;

            System.out.println("Integer");
            int opcion = menu();

            switch (opcion) {

                case 1:
                    System.out.println("Suma Integer: " + (n1 + n2));
                    break;

                case 2:
                    System.out.println("Resta Integer: " + (n1 - n2));
                    break;

                case 3:
                    System.out.println("Multiplicacion Integer: " + (n1 * n2));
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }

        else if (num1 instanceof Double && num2 instanceof Double) {

            double n1 = (Double) num1;
            double n2 = (Double) num2;

            System.out.println("Double");
            int opcion = menu();

            switch (opcion) {

                case 1:
                    System.out.println("Suma Double: " + (n1 + n2));
                    break;

                case 2:
                    System.out.println("Resta Double: " + (n1 - n2));
                    break;

                case 3:
                    System.out.println("Multiplicacion Double: " + (n1 * n2));
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }

      
        else if (num1 instanceof Float && num2 instanceof Float) {

            float n1 = (Float) num1;
            float n2 = (Float) num2;

            System.out.println("Float");
            int opcion = menu();

            switch (opcion) {

                case 1:
                    System.out.println("Suma Float: " + (n1 + n2));
                    break;

                case 2:
                    System.out.println("Resta Float: " + (n1 - n2));
                    break;

                case 3:
                    System.out.println("Multiplicacion Float: " + (n1 * n2));
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }

        
        else if (num1 instanceof String && num2 instanceof String) {

            System.out.println("String: " + num1 + " " + num2);
        }

        
        else if (num1 instanceof Character && num2 instanceof Character) {
            System.out.println("No se puede concatenar.");
        }
    }

    private int menu() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.print("Opcion: ");

        return teclado.nextInt();
    }
}
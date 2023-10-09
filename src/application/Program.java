package application;

import entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println("Digite as medidas do triangulo X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Digite as medidas do triangulo Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triangulo X: %.2f\n", areaX);
        System.out.printf("Área do triangulo Y: %.2f\n", areaY);

        if(areaX > areaY){
            System.out.printf("Maior área X: %.2f\n",areaX );
        }
        else {
            System.out.printf("Maior área X: %.2f\n",areaY );
        }
        scan.close();
    }
}

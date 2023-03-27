package Figuras.Ejecuccion;

import java.util.Scanner;
import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Rectangulo;
import Figuras.Triangulo;

public class Inicio {
    public static void main(String[]args){
        int opcion;
        double area = 0;
        double lados = 0;        
        double base = 0;
        double altura = 0;
        double radio = 0;
        Cuadrado cuadrado = new Cuadrado(lados);
        Triangulo triangulo = new Triangulo( area,  base,  altura);
        Rectangulo rectangulo = new Rectangulo(base,  altura);
        Circulo circulo = new Circulo(radio);
       
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Digíte la opcion a la cual quiere saber su área");
        System.out.println("1. Cuadrado");
        System.out.println("2. Tríangulo" );
        System.out.println("3. Rectángulo");
        System.out.println("4. Círculo");
        opcion = lectura.nextInt();
    
        switch (opcion) {
            case 1:
                cuadrado.calcularArea();
                break;
            case 2:
                triangulo.calcularArea();
                break;
            case 3:
                rectangulo.calcularArea();
                break;
            case 4:
                circulo.calcularArea();
                break;
        }
        lectura.close();
    } 
}

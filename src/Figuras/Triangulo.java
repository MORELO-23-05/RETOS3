package Figuras;

import java.util.Scanner;

public class Triangulo extends Figura{
    private double area;
    private double base;
    private double altura;
    
    public void calcularArea() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base");
        base = lectura.nextDouble();
        System.out.println("Ingrese el alto del tirangulo");
        altura = lectura.nextDouble();
        area = (Double) (base * altura) / 2;
        System.out.println("El área del triangulo es:" + area);
        lectura.close();
    }

    public Triangulo(double area, double base, double altura) {
        this.area = area;
        this.base = base;
        this.altura = altura;
    }
}

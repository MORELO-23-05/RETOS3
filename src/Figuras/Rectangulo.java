package Figuras;
import java.util.Scanner;

public class Rectangulo extends Figura{
    private double area;
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        Scanner Lectura = new Scanner(System.in);
        System.out.println("Digíte el valor de la base");
        base = Lectura.nextDouble();
        System.out.println("Digíte la altura del rectangulo");
        altura = Lectura.nextDouble();
        area = base * altura;
        System.out.println("El área del rectangulo es: " + area);
        Lectura.close();
    }
}

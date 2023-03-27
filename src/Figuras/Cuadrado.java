package Figuras;
import java.util.Scanner;

public class Cuadrado extends Figura{
    //crear atributos
    private double area;
    private double lados;
 
    public Cuadrado(Double lados) {
        extracted();
    }

    private double extracted() {
        double lados = this.lados;
        return this.lados = lados;
    }

    //crear metodos
    public void calcularArea(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("digíte el valor de uno de los lados del cuadrado");
        lados = lectura.nextDouble();
        area = lados*lados*lados*lados;
        System.out.println("El área del cuadrado es: " + area);
        lectura.close();
    }
}

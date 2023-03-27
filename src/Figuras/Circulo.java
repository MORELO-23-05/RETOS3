package Figuras;
import java.util.Scanner;

public class Circulo extends Figura{
    //Crear atributos 
    private double radio;
    private double area;
    
    public Circulo(Double radio) {
        this.radio = radio;
    } 
    //Crear metodos 
    public void calcularArea(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digíte el radio del circulo");
        radio = lectura.nextDouble();
        area = Math.PI * Math.pow(radio,2);
        System.out.println("El área del circulo es de: " + area);
        lectura.close();
    }


}

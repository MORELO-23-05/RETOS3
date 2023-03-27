package Salud.Ejecuccion;

import java.util.Scanner;
import Salud.Empleado;
import Salud.persona;

public class Inicio2 extends persona {
    public static void main(String[]args) {


        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor digite su cargo: ");
        String cargo = lectura.nextLine();
        System.out.println("Por favor digite el valor de las horas de trabajo: ");
        double valorHora = lectura.nextDouble();
        System.out.println("Por favor ingrese las horas trabajadas: ");
        double horasTrabajadas = lectura.nextDouble();
        System.out.println("Por favor digite el departamento donde trabaja: ");
        String departamento = lectura.next();

        Empleado empleado = new Empleado(departamento, cargo, horasTrabajadas, valorHora);
        empleado.pedirDatos();
        empleado.mostrarEmpleado();
        
       
        lectura.close();
    }
}

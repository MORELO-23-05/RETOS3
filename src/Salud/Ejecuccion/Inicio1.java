package Salud.Ejecuccion;

import Salud.persona;

public class Inicio1 {
    public static void main(String[]args) {

        //Crear objetos para cada clase
        persona Persona1 = new persona();

        //Llamar los metodos
        Persona1.pedirDatos();
        Persona1.mostrarPersona();
        Persona1.mayorDeEdad();
      
        //Llamar metodo imc con modificaciones RETO 2
        String estadoPeso = Persona1.calcularImc();
        //Clacular el estado y mostrar mensaje
        if (estadoPeso.equals("PESOBAJO")) {
            System.out.println(" Tu tienes un peso bajo.");
        } else if (estadoPeso.equals("PESOIDEAL")) {
            System.out.println(" Tu estas en el peso ideal.");
        } else {
            System.out.println(" Tu estas en sobrepeso.");
        }
    }
}

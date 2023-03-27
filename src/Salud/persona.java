package Salud;

import java.util.Scanner;

public class persona {
     //Atributos propios de la clase
     private String tipoDoc;
     private int documento;
     private String nombre;
     private String apellido;
     private double peso;
     private double estatura;
     private int edad;
     private String sexo;

    //Creamos el encapsulamiento de los datos privados y el metodo constuctor
    public persona(String nombre, String tipoDoc, int documento, String apellido, double peso, double estatura, int edad, String sexo, String string) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }
   
    public persona() {
    }

    //Creamos getters y setters
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Error: El peso debe ser mayor que cero.");
        }
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura > 0) {
            this.estatura = estatura;
        } else {
            System.out.println("Error: La estatura debe ser mayor que cero.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor que cero.");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //Creamos un metodo para pedir los datos
     public void pedirDatos() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor digite su tipo de documento: ");
        tipoDoc = lectura.nextLine();
        System.out.println("Por favor ingrese su documento: ");
        documento = lectura.nextInt();
        System.out.println("Por favor ingrese su nombre: ");
        nombre = lectura.next();
        System.out.println("Por favor digite sus apellidos: ");
        apellido = lectura.next();
        System.out.println("Por favor digite su peso en KL: ");
        peso = lectura.nextDouble();
        System.out.println("Por favor digite su estatura en metros: ");
        estatura = lectura.nextDouble();
        System.out.println("Por favor digite su edad: ");
        edad = lectura.nextInt();
        System.out.println("Por favor digite su sexo: ");
        sexo = lectura.next();

        lectura.close();

        }
        //Creamos un metodo para mostrar los datos
        public void mostrarPersona() {
            System.out.println("Su tipo de documento es: "+ tipoDoc);
            System.out.println("Su documento es: "+ documento);
            System.out.println("Su nombre es: "+ nombre);
            System.out.println("Sus apellidos son: "+ apellido);
            System.out.println("Su peso es: "+ peso);
            System.out.println("Su estatura es: "+ estatura);
            System.out.println("Su edad es: "+ edad);
            System.out.println("Su sexo es: "+ sexo);
        }
        //Metodo imc con modificaciones RETO 2
        public String calcularImc() {
            double pesoActual = peso/(estatura * estatura);

            if (pesoActual < 20) {
                return "PESOBAJO";
            }else if(pesoActual >= 20 && pesoActual <= 25){
                return "PESOIDEAL";
            }
                return "SOBREPESO";
        }
        public void mayorDeEdad() {
            if (edad >= 18) {
                System.out.println("usted es mayor de edad");
            }else{
                System.out.println("Usted es menor de edad");
            }
            
        }
        
        
  }
        
    

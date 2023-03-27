package Salud;

public class Empleado  extends persona{
    //Atributos propios de la subclase
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;
    private double valorTotal;
    //creamos el metodo constructor de la subclase
    public Empleado(String cargo, String departamento, double valorHora, double horasTrabajadas) {
       //Extraemos la super clase y sus datos por defecto
        super();
        
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        
    }

    //cremos metodos propios para la subclase
    public void calcularHorarios() {
        double total = valorHora * horasTrabajadas;
        valorTotal = total * 0.00966;

    }
   
    public void mostrarEmpleado() {
        System.out.println("El nombre del empleado es: "+getNombre());
        System.out.println("El apellido del empleado es: "+ getApellido());
        System.out.println("El tipo de documento es: "+ getTipoDoc());
        System.out.println("El documento es: "+ getDocumento());
        System.out.println("El peso del empleado es: "+ getPeso());
        System.out.println("La estatura es de: "+ getEstatura());
        System.out.println("La edad es de: "+getEdad());
        System.out.println("el sexo del empleado es de: "+getSexo());
        System.out.println("El cargo es: "+cargo);
        System.out.println("El valor de la hora es de: "+ valorHora);
        System.out.println("Las hora trabajadas son: "+ horasTrabajadas);
        System.out.println("El departamento del empleado es: "+departamento);
        System.out.println("El total del pago es de: "+valorTotal);
       }
    }

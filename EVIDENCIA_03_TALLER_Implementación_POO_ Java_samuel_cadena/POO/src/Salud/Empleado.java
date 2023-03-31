package Salud;

public class Empleado extends Persona {
    //creo atributo de la subClase o de la clase 
    public static void main(String[] args) {
        
    }
    private String cargo;
    private String tipoDocuments;
    private String nombre;
    private String apellido;
    private static  int valorHora;
    private static  int horasTrabajadas;
    private String departamento;


    //creo el metodo constructor de la subclase y traje los atributos de la superClase
    public Empleado(String tipoDoc, Persona documento, String nombre, String apellido, String cargo, int valorHora, String horasTrabajadas2, String departamento){

        super(tipoDoc,documento,nombre, apellido);
    this.cargo=cargo;
    this.valorHora=valorHora;
    this.horasTrabajadas=horasTrabajadas;
    this.departamento=departamento;
    }
    //creo los metodos propios de la subClase
    public static void calcularHorarios(){

        double totalPagar;

        totalPagar = valorHora*horasTrabajadas;
        totalPagar = ((totalPagar) - (0.9667100));


        System.out.println("su tipo de documento es: "+getTipoDocuments()+"su documento es: "+getDocumento()+"su nombre es:"+getNombre()+"su apellido es:"+getApellido()+"su cargo es: "+cargo()+"sus horas trabajadas son: "+horasTrabajadas()+"el valor por hora es de: "+valorHora()+"su departamento es: "+departamento());
        System.out.println("el tipo de documento es: "+Empleado.getTipoDocuments());
        System.out.println("el numero de documento es: "+Empleado.getDocumento());
        System.out.println("el tipo de documento es: "+Empleado.getNombre());
        System.out.println("el tipo de documento es: "+Empleado.getApellido());
        System.out.println("el tipo de documento es: "+Empleado.getTdepartamento());
        System.out.println("el tipo de documento es: "+Empleado.getPeso());
        System.out.println("el tipo de documento es: "+Empleado.getThorasTrabajadas());
        System.out.println("el tipo de documento es: "+Empleado.getvalorHora());

    }
    
    private static String getTdepartamento() {
        return null;
    }
    private static String getThorasTrabajadas() {
        return null;
    }
    private static String getvalorHora() {
        return null;
    }
    private static String departamento() {
        return null;
    }
    private static String valorHora() {
        return null;
    }
    private static String cargo() {
        return null;
    }
    private static String horasTrabajadas() {
        return null;
    }
    
}
    



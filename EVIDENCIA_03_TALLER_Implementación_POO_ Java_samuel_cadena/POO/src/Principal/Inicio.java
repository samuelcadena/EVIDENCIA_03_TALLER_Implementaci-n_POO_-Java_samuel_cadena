package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;
import Salud.Suma;

public class Inicio {
    public static void main(String[] args) {
        double peso,estatura,calcularPeso;
        int num1,num2,resultado;
         //crear un objeto-> Instancia una clase
         Persona documento=new Persona();
         //invocando un metodo
         Persona perosna;
         //ejecuccion metodo constructor
        perosna.registrarDocuments();
         Suma persona;
        persona.mostrarDocuments();
         persona.pesoActual();
         persona.mayorEdad();
         Suma sumar=new Suma();
         //invocar metodos
         sumar.perdirNumero();
         sumar.restar();
         sumar.sumar();
         sumar.mostrarDocuments();
         Scanner captura=new Scanner(System.in);
         System.out.println("Por favor ingrese su peso");
         peso=captura.nextInt();
         System.out.println("Por favor ingrese su estatura");
         estatura=captura.nextInt();
         peso=Persona.calcularPeso(peso,estatura);
         // Argumentos se envian 
         sumar.sumar(num1, num2);
         resultado=sumar.restar();
         sumar.mostrarDocuments();
         System.out.println("el resultado de la resta es "+resultado);
         sumar.mostrarDocuments(); 
        //aqui empieza el tercero 
        
        //pido datos de la clase 
        System.out.println("por favor digite el tipo de documento ya sea CC o TI");
        String tipoDocuments = captura.next();

        System.out.println("por favor digite su numero de documento");
        int documento = captura.nextInt();

        System.out.println("por favor digite su nombre");
        String nombre = captura.next();

        System.out.println("por favor digite su apellido");
        String apellido = captura.next();

        System.out.println("por favor digite su cargo");
        String cargo = captura.next();

        System.out.println("por favor digite el valor de la hora");
        int valorHora = captura.nextInt();

        System.out.println("por favor digite las horas trabajadas");
        String horasTrabajadas = captura.next();

        System.out.println("por favor digite su departamento");
        String departamento = captura.next();
        //ejecucicion del encapsulado 
        System.out.println("El tipo de documento es "+persona.getTipoDocuments());
        System.out.println("El tipo de documento es "+persona.getDocumento());
        System.out.println("El tipo de documento es "+persona.getNombre());
        System.out.println("El tipo de documento es "+persona.getApellido());
        System.out.println("El tipo de documento es "+persona.getPeso());
        System.out.println("El tipo de documento es "+persona.getEstatura());
        System.out.println("El tipo de documento es "+persona.getTedad());
        System.out.println("El tipo de documento es "+persona.getsexo());

        Empleado empleado=new Empleado(tipoDocuments, documento, nombre, apellido, cargo, valorHora, horasTrabajadas, departamento);
        Empleado.calcularHorarios();
        captura.close();
         

}

} 
         
 
 

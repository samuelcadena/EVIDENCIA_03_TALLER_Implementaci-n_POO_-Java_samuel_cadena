package Salud;

import java.util.Scanner;

public class Suma {
     //Atributos
    /*public int num1;
    public int num2;*/
    public int Sumar;
    public double restar;
    private int edad;
    //Metodos
    /*public void perdirNumero(){
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingresar el primer numero");
        num1=captura.nextInt();
        System.out.println("Ingresar el segundo numero");
        num2=captura.nextInt();
    }
    public void suma(){
        Sumar=num1+num2;
        
    }
    public void resta(){
        restar=num1-num2;
        
    }*/
    public void mostrarDocuments(){
        System.out.println("El resultado de la suma de los dos numeros es "+Sumar);
        System.out.println("El resultado de la resta de los dos numeros es "+restar);
    }
   //metodos con parametros
    public void sumar(int num1, int num2 ){
        Sumar=num1+num2;

    }
    /*public void restar(int num1, int num2 ){
        restar=num1-num2;

    }*/

    //metodo con retorno tipos de retorno depende del dato que se retorne 
    public int restar( ){
        restar=edad-edad;
        return (int) restar;
}
    public void perdirNumero() {
    }
    public void suma() {
    }
    public void sumar() {
    }
    public void pesoActual() {
    }
    public void mayorEdad() {
    }
    public String getTipoDocuments() {
        return null;
    }
    public String getDocumento() {
        return null;
    }
    public String getNombre() {
        return null;
    }
    public String getApellido() {
        return null;
    }
    public String getPeso() {
        return null;
    }
    public String getEstatura() {
        return null;
    }
    public String getTedad() {
        return null;
    }
    public String getsexo() {
        return null;
    }

}

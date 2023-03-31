package Salud;

import java.util.Scanner;

public class Persona {

    //Atributos

    private static String tipoDoc;
    private static String documento;
    private static String nombre;
    private static String apellido;
    private int peso;
    private Double estatura;
    private int edad;
    private String sexo;
    private static double calcularPeso;
   

    //Metodos
    
    //metodo constructor vacio 
    
    public Persona(String tipoDoc2, Persona documento2, String nombre2, String apellido2) {
    }

    public Persona(String  string, int i, String string2, int j, double d, int k, String string3) {
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;
        
    }

  

    public Persona() {
    }

    public static String getTipoDocuments() {
        return tipoDoc;
    }

    public void setTipoDocuments(String tipoDocuments) {
        this.tipoDoc = tipoDocuments;
    }

    public static String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getCalcularPeso() {
        return calcularPeso;
    }

    public void setCalcularPeso(double calcularPeso) {
        this.calcularPeso = calcularPeso;
    }

    /*// creamos el metodo constructor de la clase personal con parametros de nombres anteriores a los atributos
    public void Persona(String tipoDocuments_String documento_String nombre_String apellido_String peso_Double estatura_int edad_String sexo){
        tipoDoc=_tipoDoc;
        documento=_documento;
        nombre=_nombre;
        apellido=_apellido;
        peso=_peso;
        estatura=_estatura;
        edad=_edad;
        sexo=_sexo;
    }*/
    // crenado el metodo constructor de la clase personal con parametros de nombres iguales a los atributos
    /*public void Persona(String tipoDocuments, String documento, String nombre, String apellido, Double peso, Double estatura, int edad, String sexo){
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
        this.sexo=sexo;

    }*/
    public void registrarDocuments(){
        Scanner captura=new Scanner(System.in);
        System.out.println(" Por favor ingrese el tipo de documento");
        tipoDoc=captura.nextLine();
        System.out.println("Tipo de documento");
        documento=captura.nextLine();
        System.out.println("Ingrse su nombre");
        nombre=captura.nextLine();
        System.out.println("Ingrese su apellido");
        apellido=captura.nextLine();
        System.out.println("Ingrese el peso");
        peso=captura.nextInt();
        System.out.println("Ingrese la estatura");
        estatura=captura.nextDouble();
        System.out.println("Ingrese su edad");
        edad=captura.nextInt();
        System.out.println("Ingrese su sexo");
        sexo=captura.next();
        captura.close();
         //cree un objeto de la clase en la clase persona
        Suma prueba=new Suma();
         //invoque un metodo de la clase suma en un metodo de la clase persona
        prueba.restar();
    }
    //metodo con parametros
    public void mostrarDocuments(String tipoDocuments, Persona documento, String nombre, String apellido, String peso, Double estatura, int edad, String sexo){
        System.out.println("El tipo de documento es "+tipoDoc);
        System.out.println("El documento es "+documento);
        System.out.println("El nombre es "+nombre);
        System.out.println("El apellido es "+apellido);
        System.out.println("El peso es "+peso);
        System.out.println("La estatura es "+estatura);
        System.out.println("La edad es "+edad);
        System.out.println("El tipo de sexo es "+sexo);
    }
    // metodo retorno 
    public static double calcularPeso(double peso, double estatura){

        calcularPeso=peso/(estatura*estatura);

    
        if(calcularPeso<20){
            System.out.println("peso bajo");

        }
        else if(calcularPeso>20 && calcularPeso<=25){
            System.out.println("peso ideal");
        }else if(calcularPeso>25){
            System.out.println("sobrepeso");
        }
        return calcularPeso;
    }
    public void mayorEdad(){
        if(edad>=18){
            System.out.println("usted es mayor de edad " + edad);
        }else if(edad<18){
            System.out.println("usted es menor de edad " + edad);
        }else if(edad>18);

    }
    
   
    } 


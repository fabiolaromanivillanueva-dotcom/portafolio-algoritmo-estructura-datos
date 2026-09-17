package Arreglo;
import Arreglo.Arreglo;
import java.util.Scanner ;

public class AplicaArreglo {
    static Arreglo objArreglo = new Arreglo();
    static Scanner teclado = new Scanner (System.in);
    
    public static void main (String[] args){
        menu();
    }
    
    static void menu (){
        int opcion, tam;
    do {
       System.out.println("  Menu de Opciones "); 
       System.out.println("=========================== "); 
       System.out.println("1.- Crea el Arreglo");
       System.out.println("=========================== ");
       System.out.println("2.- Ingresa Datos");
       System.out.println("3.- Mostrar Datos");
       System.out.println("4.- Suma de Paredes");
       System.out.println("5.- Suma de elementos");
       System.out.println("6.- Hallar menor, mayor y promedio");
       System.out.println("7.- Suma de Impares");
       System.out.println("8.- Eliminar elemento");
       System.out.println("9.- Modificar elemento");
       System.out.println("10.- Insertar elemento");
       System.out.println("11.- Primer elemento al Final");
       System.out.println("12.- Primer par al Final");
       System.out.println("=========================== ");
       System.out.println("0.- Salir ");
       System.out.println("=========================== ");
       
       
       System.out.println("Ingrese una Alternativa:  ");
       opcion = teclado.nextInt();
       System.out.println();
       
       if (opcion == 1){
       System.out.println("Ingrese el tamaño del Arreglo :  ");
       tam = teclado.nextInt();
       objArreglo.creaArreglo(tam);
       System.out.println("");
       }
    
       if (opcion == 2) {
           objArreglo.lectura();
       }  
    
       if (opcion == 3) {
           objArreglo.escritura();
       }  
       
       if (opcion == 4) {
           objArreglo.sumaPares();
       }  
       
       if (opcion == 5) {
           objArreglo.sumaElementos();
       }
       
       if (opcion == 6) {
           objArreglo.menorMayorPromedio();
       }
       
       if (opcion == 7) {
          objArreglo.sumaImpares();
       }
       
       if (opcion == 8) {
           int valor;
           System.out.println("Ingrese el elemento a Eliminar: ");
           valor = teclado.nextInt();
           objArreglo.eliminaElemento(valor);
       }
       
        if (opcion == 9) {
           int valor,nuevoValor;
           System.out.println("Ingrese el elemento a modificar: ");
           valor = teclado.nextInt();
           
           System.out.println("Ingrese el nuevo elemento");
           nuevoValor = teclado.nextInt();
           objArreglo.modificaElemento(valor, nuevoValor);
       }
       
       if (opcion == 10) {
        int valor, posicion;
        System.out.println("Ingrese el elemento a insertar: ");
        valor = teclado.nextInt();
        System.out.println("Ingrese la posicion: ");
        posicion = teclado.nextInt();
        objArreglo.insertaElemento(valor, posicion);
       } 
       
       if (opcion == 11) {
          objArreglo.primerElementoAlFinal();
       }
        
        if (opcion == 12) {
           objArreglo.primerParAlFinal();
       }

       
    } 
    while (opcion !=0);
    
}
}

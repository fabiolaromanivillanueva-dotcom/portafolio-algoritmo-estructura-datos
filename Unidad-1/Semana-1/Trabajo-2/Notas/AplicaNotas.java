package Notas;
import java.util.Scanner;
public class AplicaNotas {
   static Notas objNotas = new Notas();
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args){
        menu();
    }
    
    static void menu(){
        
        int opcion, tam;
        
        do {
            System.out.println("  Menu de Opciones ");
            System.out.println("===========================");
            System.out.println("1.- Crea el Arreglo");
            System.out.println("2.- Ingresa Notas");
            System.out.println("3.- Mostrar Notas");
            System.out.println("4.- Eliminar Nota Menor");
            System.out.println("5.- Mostrar Promedio");
            System.out.println("===========================");
            System.out.println("0.- Salir");
            System.out.println("===========================");
            
            System.out.println("Ingrese una Alternativa: ");
            opcion = teclado.nextInt();
            System.out.println();
            
          if (opcion == 1){
             while (true){
              System.out.println("Ingrese el numero de practicas: ");
               tam = teclado.nextInt();       
        if (tam > 0){
            break;
        } else {
            System.out.println("El numero de practicas debe ser mayor a 0");
        }
    }
    objNotas.creaArreglo(tam);
    System.out.println();
    }       
          
            if (opcion == 2){
                objNotas.lectura();
            }
            
            if (opcion == 3){
                objNotas.escritura();
            }
            
            if (opcion == 4){
                objNotas.eliminaNotaMenor();
            }
            
            if (opcion == 5){
               objNotas.promedio();
            }
            
        } while (opcion != 0);
    }
}

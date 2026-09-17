package AplicaArreglosModificado;
import Arreglos.Arreglo;
import java.util.Scanner;
public class AplicaArreglo {
      static Arreglo objArreglo = new Arreglo();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int opcion, tam;

        do {
            System.out.println("    Menu de Opciones");
            System.out.println("=====================");
            System.out.println("1.- Crear Arreglo");
            System.out.println("=====================");
            System.out.println("2.- Ingresar Datos");
            System.out.println("3.- Mostrar Datos");
            System.out.println("4.- Eliminar Elemento");
            System.out.println("5.- Modificar Elemento");
            System.out.println("6.- Insertar Elemento");
            System.out.println("7.- Sumar Elementos");
            System.out.println("8.- Menor, Mayor y Promedio");
            System.out.println("9.- Sumar Impares");
            System.out.println("10.- Primer Elemento al Final");
            System.out.println("11.- Primer Par al Final");
            System.out.println("=====================");
            System.out.println("0.- Salir");
            System.out.println("=====================");

            System.out.print("Ingrese una Alternativa : ");
            opcion = teclado.nextInt();
            System.out.println("");

            if (opcion == 1) {
                System.out.print("Ingrese Tamano del Arreglo : ");
                tam = teclado.nextInt();

                // Uso del constructor con parámetro
                objArreglo = new Arreglo(tam);

                System.out.println("");
            }

            if (opcion == 2) {
                objArreglo.lectura();
            }

            if (opcion == 3) {
                objArreglo.escritura();
            }
            
            if (opcion == 4) {
              int valor;
             System.out.print("Ingrese el elemento a eliminar : ");
             valor = teclado.nextInt();
            objArreglo.eliminaElemento(valor);
            }

            if (opcion == 0) {
                System.out.println("Saliendo del sistema ....");
            }
            
            if (opcion == 5) {
            int valor, nuevoValor;

             System.out.print("Ingrese el elemento a modificar : ");
             valor = teclado.nextInt();

             System.out.print("Ingrese el nuevo elemento : ");
             nuevoValor = teclado.nextInt();
             objArreglo.modificaElemento(valor, nuevoValor);
            }
            
            if (opcion == 6) {
             int valor, posicion;

               System.out.print("Ingrese el elemento a insertar : ");
               valor = teclado.nextInt();

               System.out.print("Ingrese la posicion : ");
               posicion = teclado.nextInt();
               objArreglo.insertaElemento(valor, posicion);
            }
            
            if (opcion == 7) {
             objArreglo.sumaElementos();
            }
            
            if (opcion == 8) {
             objArreglo.menorMayorPromedio();
            }
            
            if (opcion == 9) {
             objArreglo.sumaImpares();
            }
            
            if (opcion == 10) {
             objArreglo.primerElementoAlFinal();
            }
            
            if (opcion == 11) {
             objArreglo.primerParAlFinal();
            }

        } while (opcion != 0);
    }
}

    


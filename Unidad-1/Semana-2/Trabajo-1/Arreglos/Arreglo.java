package Arreglos;
import java.util.Scanner;

public class Arreglo {
 
  // Atributos encapsulados
    private int[] numerito;
    private int tope;
    private Scanner teclado;

    // Constructor por defecto
    public Arreglo() {
        this.numerito = null;
        this.tope = 0;
        this.teclado = new Scanner(System.in);
    }

    // Constructor con parámetro
    public Arreglo(int valor) {
        this.numerito = new int[valor];
        this.tope = 0;
        this.teclado = new Scanner(System.in);
    }

    // Getter y Setter de numerito
    public int[] getNumerito() {
        return numerito;
    }

    public void setNumerito(int[] numerito) {
        this.numerito = numerito;
    }

    // Getter y Setter de tope
    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    // Método para crear el arreglo
    public void creaArreglo(int valor) {
        setNumerito(new int[valor]);
        setTope(0);
    }

    // Método para ingresar datos
    public void lectura() {
        if (getNumerito() == null) {
            System.out.println("Primero debe crear el arreglo.");
            return;
        }

        if (getTope() < getNumerito().length) {
            getNumerito()[getTope()] = getNumero();
            setTope(getTope() + 1);
        } else {
            System.out.println("El arreglo está lleno.");
        }
    }

    // Método para leer un número
    public int getNumero() {
        int valor;
        System.out.print("Ingrese Numero : ");
        valor = teclado.nextInt();
        return valor;
    }

    // Método para mostrar datos
    public void escritura() {
        System.out.println("\tListado");
        System.out.println("\t--------");

        if (getNumerito() == null || getTope() == 0) {
            System.out.println("No hay elementos");
        } else {
            for (int i = 0; i < getTope(); i++) {
                System.out.print(getNumerito()[i] + "\t");
            }
        }

        System.out.println("\n\n");
    }
    
    // Método para eliminar un elemento
    public void eliminaElemento(int valor) {
    for (int r = 0; r < getTope(); r++) {   
        
        if (getNumerito()[r] == valor) {            
            for (int j = r; j < getTope() - 1; j++) {
                getNumerito()[j] = getNumerito()[j + 1];
            }
            
            setTope(getTope() - 1);
            break;
        }
    }
}
    
    // Método para modificar un elemento
       public void modificaElemento(int valor, int nuevoValor) {
         for (int r = 0; r < getTope(); r++) {
        
          if (getNumerito()[r] == valor) {
            getNumerito()[r] = nuevoValor;
            break;
        }
    }
}
  
    // Método para insertar un elemento
       public void insertaElemento(int valor, int posicion) {    
        
           if (getTope() < getNumerito().length) {
        
        for (int r = getTope(); r > posicion; r--) {
            getNumerito()[r] = getNumerito()[r - 1];
        }
        
        getNumerito()[posicion] = valor;
        setTope(getTope() + 1);
    }
}

    // Método para sumar todos los elementos
       public void sumaElementos() {
           
        int suma = 0;
    
       for (int r = 0; r < getTope(); r++) {
        suma = suma + getNumerito()[r];
    }
    
    System.out.println("La Suma de los elementos es : " + suma);
}
 
 
       // Método para hallar el menor, mayor y promedio
          public void menorMayorPromedio() {   
           int menor = getNumerito()[0];
           int mayor = getNumerito()[0];
           int suma = 0;
           float promedio;
    
           for (int r = 0; r < getTope(); r++) {
        
        if (getNumerito()[r] < menor) {
            menor = getNumerito()[r];
        }
        
        if (getNumerito()[r] > mayor) {
            mayor = getNumerito()[r];
        }
        
        suma = suma + getNumerito()[r];
    }
    
    promedio = (float) suma / getTope();   
    System.out.println("El numero menor es : " + menor);
    System.out.println("El numero mayor es : " + mayor);
    System.out.println("El promedio es : " + promedio);
}
 
          
    // Método para sumar los elementos impares
       public void sumaImpares() {    
        int suma = 0;
    
         for (int r = 0; r < getTope(); r++) {
        
          if (getNumerito()[r] % 2 != 0) {
            suma = suma + getNumerito()[r];
        }
    }
    
    System.out.println("La Suma de los impares es : " + suma);
}
  
// Método para mover el primer elemento al final
public void primerElementoAlFinal() {
    
    if (getTope() > 1) {
        
        int aux = getNumerito()[0];
        
        for (int r = 0; r < getTope() - 1; r++) {
            getNumerito()[r] = getNumerito()[r + 1];
        }
        
        getNumerito()[getTope() - 1] = aux;
    }
}       
 
// Método para mover el primer elemento par al final
public void primerParAlFinal() {
    
    for (int r = 0; r < getTope(); r++) {
        
        if (getNumerito()[r] % 2 == 0) {
            
            int aux = getNumerito()[r];
            
            for (int j = r; j < getTope() - 1; j++) {
                getNumerito()[j] = getNumerito()[j + 1];
            }
            
            getNumerito()[getTope() - 1] = aux;
            break;
        }
    }
}
       
}



package Arreglo;
import java.util.Scanner;

public class Arreglo {
    int [] numerito;
   private int tope = 0;
   private Scanner teclado =  new Scanner(System.in);
   
   public Arreglo (){
       //constructor 
       
   }
   
   public void creaArreglo(int valor){
       numerito = new int[valor];
   }
   
   public void lectura(){
       if (tope < numerito.length){
           numerito [tope] = getNumero();
           tope++;
       }
   }
   
   public int getNumero() {
       int valor;
       System.out.println("Ingrese un Numero :  ");
       valor = teclado.nextInt();
       return valor;
   }
  
   public void escritura() {
       System.out.println (" Listado ");
       System.out.println (" =========== ");
       
       if (tope  > 0 ) {
           for (int r = 0; r < tope; r++) {
               System.out.println(numerito[r] + "  ");
           }
       } else {
         System.out.println(" No existe elementos ");    
       }
       System.out.println("  ");
   }
   
   public void sumaPares() {
       int suma = 0; 
       
       for (int r = 0; r < tope; r++){
           if (numerito [r] % 2 == 0 ){
               suma = suma + numerito [r];
           }
        System.out.println("La Suma es : " + suma);
       }
   }
   
   public void eliminaElemento(int valor){
    for (int r = 0; r < tope; r++){
        if (numerito[r] == valor){
           for (int j = r; j < tope - 1; j++){
                numerito[j] = numerito[j + 1];
            }
            
            tope--;
            break;
        }
    }
}

    public void modificaElemento(int valor, int nuevoValor){
    for (int r = 0; r < tope; r++){
       if (numerito[r] == valor){
            numerito[r] = nuevoValor;
            break;
        }
    }
}
       
     public void insertaElemento(int valor, int posicion){
        if (tope < numerito.length){
         for (int r = tope; r > posicion; r--){
            numerito[r] = numerito[r - 1];
        }
        numerito[posicion] = valor;
        tope++;
    }
  }
     
     public void sumaElementos(){
       int suma = 0;
        for (int r = 0; r < tope; r++){
          suma = suma + numerito[r];
        }
       System.out.println("La Suma de los elementos es : " + suma);
       }
     
     public void menorMayorPromedio(){
       int menor = numerito[0];
       int mayor = numerito[0];
       int suma = 0;
       float promedio;
        for (int r = 0; r < tope; r++){
        if (numerito[r] < menor){
            menor = numerito[r];
        }
        if (numerito[r] > mayor){
            mayor = numerito[r];
        }
        suma = suma + numerito[r];
    }
        promedio = (float)suma / tope;
        System.out.println("El numero menor es : " + menor);
        System.out.println("El numero mayor es : " + mayor);
        System.out.println("El promedio es : " + promedio);
   }
     
     public void sumaImpares(){
       int suma = 0;
        for (int r = 0; r < tope; r++){
         if (numerito[r] % 2 != 0){
            suma = suma + numerito[r];
        }
    }
        System.out.println("La Suma de los impares es : " + suma);
  }
     
     public void primerElementoAlFinal(){
       if (tope > 1){
        int aux = numerito[0];
        for (int r = 0; r < tope - 1; r++){
            numerito[r] = numerito[r + 1];
        }       
        numerito[tope - 1] = aux;
    }
}
    
    public void primerParAlFinal(){
     for (int r = 0; r < tope; r++){
         if (numerito[r] % 2 == 0){            
            int aux = numerito[r];            
            for (int j = r; j < tope - 1; j++){
                numerito[j] = numerito[j + 1];
            }           
            numerito[tope - 1] = aux;
            break;
        }
    }
}
   
   
}

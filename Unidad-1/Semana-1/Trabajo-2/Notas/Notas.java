package Notas;
import java.util.Scanner;
public class Notas {
    //Atributos 
    static int[] notas ;
    static int tope = 0;
    static Scanner teclado = new Scanner(System.in);
    
    public Notas (){
        //constructor
    }
            
   public void creaArreglo(int valor){
       notas = new int[valor];
   }
    
   public void lectura(){
       if(tope < notas.length){
           notas[tope] = getNota();
           tope++;
       } else {
        System.out.println("El arreglo esta lleno");
    }
   }
   
public int getNota(){
    int valor;
    while (true){
        System.out.println("Ingrese una Nota : ");
        valor = teclado.nextInt();
        if (valor >= 0 && valor <= 20){
            break;
        } else {
          System.out.println("La nota debe estar entre 0 y 20");
        }
    }   
    return valor;
}
   
   public void escritura(){
       System.out.println("Listado de Notas");
       System.out.println("====================");
       
       if (tope > 0){
           for(int r = 0; r < tope; r++){
               System.out.println(notas[r]);
           }
       } else {
           System.out.println("No existe notas");
       }
       System.out.println();
   }
   
   public void eliminaNotaMenor(){
       int menor = notas[0];
       int posicion = 0;
      
       for (int r = 1; r < tope; r++){
        if (notas[r] < menor){
            menor = notas[r];
            posicion = r;
        }
    }
    for (int r = posicion; r < tope - 1; r++){
        notas[r] = notas[r + 1];
    }   
    tope--;               
   }
 
   public void promedio(){
    int suma = 0;
    float promedio;    
    for (int r = 0; r < tope; r++){
        suma = suma + notas[r];
    }   
    promedio = (float)suma / tope;    
    System.out.println("El promedio es : " + Math.round(promedio));
  }
   
}

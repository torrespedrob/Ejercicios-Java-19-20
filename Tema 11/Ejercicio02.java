//Imports necesarios para el funcionamiento del programa
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ejercicio02 {
  public static void main(String[] args) {
    try {
      //Determina la salida de datos
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      
      //Crea la variable que se mostrará en pantalla
      String salida = "";
      while (salida != null) {
        System.out.print(salida + " ");
        salida = br.readLine();
      } 
      System.out.println();
      br.close();
      
    } catch (IOException e) { //Salida en caso de error.
      System.out.println("Ha ocurrido un error al leer el archivo.");
    }
  }
}

//Imports necesarios para el funcionamiento del programa
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Ejercicio01 {
  public static void main(String[] args) {

    try { 
      //Determina la salida de datos
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
      //Checkea los números primos del 1 al 500
      for (int i = 1; i < 501; i++) {
        if (esPrimo(i)) { //Utiliza la función específica esPrimo
          bw.write(String.valueOf(i) + "\n");
        }
      }
      bw.close();

    } catch (IOException ioe) { //Salida en caso de error
        System.out.println("Ha ocurrido un error a la hora de escribir el archivo.");
    }
  }

//Función dedicada a comprobar números primos
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
}

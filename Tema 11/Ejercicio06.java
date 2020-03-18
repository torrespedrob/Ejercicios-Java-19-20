//Imports necesarios para el funcionamiento del programa
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ejercicio06 {

  public static void main(String[] args) {
    //Comprueba que se han introducido los parámetros necesarios
    if (args.length != 2) {
      System.out.println("Para usar el programa: Ejercicio06 FICHERO PALABRA");
      System.exit(-1);
    }
        
    try {
      //Crea los buffers y variables necesarias
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String palabra = args[1];
      String linea = "";
      int i = 0;
      int numApariciones = 0;
      
      while ((linea = br.readLine()) != null) {
        
        while ((i = linea.indexOf(palabra)) != -1) { //Busca y cuenta las apariciones de la palabra
          linea = linea.substring(i + palabra.length(), linea.length());
          numApariciones++;
        }
      }
      
      br.close();
      
      System.out.println("La palabra " + palabra + " introducida aparece " + numApariciones + " veces en el fichero.");

    } catch (IOException ioe) { //Controla los errores
      System.err.println(ioe.getMessage());
    }
  }
}

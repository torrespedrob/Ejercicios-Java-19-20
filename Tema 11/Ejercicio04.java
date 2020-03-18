//Imports necesarios para el funcionamiento del programa
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

class Ejercicio04 {
  public static void main(String[] args) {
    
    //Comprueba que se hayan introducidos los parámetros necesarios
    if (args.length != 1) {
      System.out.println("Para usar este programa escribe: Ejercicio04 FICHERO.TXT");
      System.exit(-1);
    }

    try {
      //Declara el lector de archivos
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      //Crea una variable para la longitud de los argumentos introducidos
      int l = args[0].length();
      //Crea las variables donde se almacenaran el nombre y la extension del archivo
      String nombre = args[0].substring(0, l - 4);
      String extension = args[0].substring(l - 4, l);

      //Crea la coletilla _sort
      BufferedWriter bw = new BufferedWriter(new FileWriter(nombre + "_sort" + extension));

      Vector<String> v = new Vector<String>();

      String salida = "";
      while (salida != null) {
        v.addElement(salida);
        salida = br.readLine();
      }
      br.close();

      v.removeElementAt(0);
      Collections.sort(v);
      
      for (String s: v) {
        bw.write(s + "\n");
      }

      bw.close();
    } catch (IOException ioe) { //Controla los errores
      System.err.println(ioe.getMessage());
    }
  }
}

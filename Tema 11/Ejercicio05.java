//Imports necesarios para el funcionamiento del programa
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Ejercicio05 {
  public static void main(String[] args) {
    
    //Comprueba que se han introducido los parámetros necesarias
    if (args.length != 2) {
      System.out.println("Para usar el programa: Ejercicio05 PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
      System.exit(-1);
    }
        
    try { //Crea los buffers y variables necesarios
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

      String lineaOrigen = "";
      String lineaDestino = "";
      boolean comentarioDeBloque = false;
      int i = 0;
      
      while ((lineaOrigen = br.readLine()) != null) {
        
        int l = lineaOrigen.length(); //Guarda la longitud de la linea
        lineaDestino = lineaOrigen;

        //Detecta el comienzo de un comentario de bloque
        if ((i = lineaOrigen.indexOf("/*")) != -1) {
          comentarioDeBloque = true;
          lineaDestino = lineaOrigen.substring(0, i);
          lineaOrigen = lineaDestino;
        }
        
        //Detecta el final de un comentario de bloque 
        if ((i = lineaOrigen.indexOf("*/")) != -1) {
          comentarioDeBloque = false;
          lineaDestino = lineaOrigen.substring(i + 2, l);
        }
        //Detecta un comentario de una sola linea
        if (((i = lineaOrigen.indexOf("//")) != -1) && !comentarioDeBloque) {
          lineaDestino = lineaOrigen.substring(0, i);
        }

        if (!comentarioDeBloque) {
          bw.write(lineaDestino + "\n");
        }
      }
      
      br.close();
      bw.close();

    } catch (IOException ioe) { //Controla los errores
      System.err.println(ioe.getMessage());
    }
  }
}

//Imports necesarios para el funcionamiento del programa
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Ejercicio03 {
  public static void main(String[] args) {
    //En caso de que no se hayan introducido los parámetros necesarios
    if (args.length != 3) {
      System.out.println("Para usar este programa escribe: Ejercicio03 FICHERO1 FICHERO2 DESTINO");
      System.exit(-1); // Termina el programa
    }
    try {
      //Crea los lectores y el escritor necesarios para el funcionamiento del programa
      BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader bf2 = new BufferedReader(new FileReader(args[1]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));
    
      //Crea las variables donde se almacenarán el contenido de los otros archivos
      String salida1 = "";
      String salida2 = "";
      
      while ( (salida1 != null) || (salida2 != null) ) { 
        //Lee el contenido de los parámetro introducidos
        salida1 = bf1.readLine();
        salida2 = bf2.readLine();
        
        //Si el archivo contiene datos, lo asigna como salida
        if (salida1 != null) {
          bw.write(salida1 + "\n");
        }
        
        if (salida2 != null) {
          bw.write(salida2 + "\n");
        }
      } 
    
      bf1.close();
      bf2.close();
      bw.close();
    
    } catch (IOException ioe) { //Para controlar los errores
      System.out.println("Se ha producido un error de lectura/escritura");
      System.err.println(ioe.getMessage());
    }
  }
}

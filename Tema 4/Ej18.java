public class Ej18 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo saber cuál es la primera cifra de un número entero introducido");
    System.out.println("Introduce un número entero: ");
    int entrada = Integer.parseInt(System.console().readLine());
    int primero = 0;
    
    //Cálculo
    if (entrada < 10) {
      primero = entrada;
    } 
    
     if (( entrada >= 10 ) && ( entrada < 100 )) {
      primero = entrada / 10;
    }
    
    if (( entrada >= 100 ) && ( entrada < 1000 )) {
      primero = entrada / 100;
    }
    
    if (( entrada >= 1000 ) && ( entrada < 10000 )) {
      primero = entrada / 1000;
    }
    
    if ( entrada >= 10000 ) {
      primero = entrada / 10000;
    }
    
    System.out.println("La primera cifra de " + entrada + " es" + primero);
  }
}

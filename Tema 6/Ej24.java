public class Ej24 { // Clase principal
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo escoger un digito aleatorio de un numero");
    System.out.print("Introduce un numero entero: ");
    int entrada = Integer.parseInt(System.console().readLine());
    int digito = entrada;
    int posicion;
    int longitud = 0;
    
    //Programa
    do {
      digito /= 10;
      longitud++;
    } while (digito > 0);
    
    posicion = (int)(Math.random() * longitud) + 1;
    System.out.print((entrada / (long)(Math.pow(10, longitud - posicion))) % 10);
    
  }
}

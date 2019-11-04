public class Ej14 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce el numero(0 a 100) en el que estes pensando: ");
    int entrada = Integer.parseInt(System.console().readLine());
    System.out.println("Ahora intentare adivinar el numero");
    int oportunidades = 5;
    int generado;
    int maximo = 101;
    int minimo = 0;
    int respuesta;
    
    do {
      generado = (int)(Math.random()*maximo + minimo);
      System.out.println("Creo que es el " + generado);
      System.out.print("Di si es 1)Igual 2)Mayor 3)Menor: ");
      respueta = Integer.parseInt(System.console().readLine());
      switch (respuesta) {
        case 1:
          if (generado == entrada) {
          System.out.print("Lo he adivinado");
        } else {
          System.out.print("Yo creo que no");
        }
        break;
        case 2:
        
      }
      
      
    } while(oportunidades > 5);
  }
}

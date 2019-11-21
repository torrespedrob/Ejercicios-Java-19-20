import java.util.Scanner;
public class Tesoro {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Declaración de constantes
    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;//3 intentos
    
    //Declaración del array y coordenadas
    int x;
    int y;
    int[][] cuadrante = new int[5][4];
    
    // inicializa el array
    for(x = 0; x < 4; x++) {
      for(y = 0; y < 3; y++) {
        cuadrante[x][y] = VACIO;
      }
    }
    
    // coloca la mina
    int minaX = (int)(Math.random() * 5);
    int minaY = (int)(Math.random() * 4);
    cuadrante[minaX][minaY] = MINA;
    
    // coloca el tesoro
    int tesoroX;
    int tesoroY;
    do { //Sigue intentando hasta que no coincidan
      tesoroX = (int)(Math.random() * 5);
      tesoroY = (int)(Math.random() * 4);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    cuadrante[tesoroX][tesoroY] = TESORO;
    
    // Juego
    System.out.println("¡Busca el tesoro! Intenta adivinar donde se encuentra");
    boolean salir = false;
    String c = "";
    do {
      // pinta el cuadrante
      for(y = 3; y >= 0; y--) {
        System.out.print(y+1 + "|");  
        for(x = 0; x < 5; x++) {
          if (cuadrante[x][y] == INTENTO) {
            System.out.print("X ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
      System.out.println("  ----------\n  1 2 3 4 5\n");

      // pide las coordenadas  
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(s.nextLine())-1;
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(s.nextLine())-1;
      
      //Mira que hay en las coordenadas introducidas
      switch(cuadrante[x][y]) {
        case VACIO:
          cuadrante[x][y] = INTENTO;
          break;
        case MINA:
          System.out.println("Mala suerte, has perdido.");
          salir = true;
          break;
        case TESORO:
          System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!"); 
          salir = true;
          break;
        default:
      }
    } while (!salir);

    // pinta el cuadrante
    for(y = 3; y >= 0; y--) {
      System.out.print(y + " ");
      for(x = 0; x < 5; x++) {
        switch(cuadrante[x][y]) {
          case VACIO:
            c = "  ";
            break;
          case MINA:
            c = "* ";
            break;
          case TESORO: 
            c = "€ ";
            break;
          case INTENTO:
            c = "X ";
            break;
          default:
        }
        System.out.print(c);
      }
      System.out.println();    
    }
    System.out.println("  ----------\n  1 2 3 4 5\n");
  }
}

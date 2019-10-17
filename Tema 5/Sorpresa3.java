public class Sorpresa3 {
  public static void main(String[] args) {
    //Entrada
    System.out.print("Por favor, introduzca la altura del reloj de arena: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el carácter del reloj: ");
    String caracter = System.console().readLine();
    System.out.print("Introduce el número de repeticiones: ");
    int repeticiones = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    //Cálculo
    for (int z = 0; z < repeticiones; z++) {
    int altura = 1;
    int asteriscos = alturaIntroducida;
    int espaciosPorDelante = 0;
    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
      // parte de arriba //
      while (altura < alturaIntroducida / 2 + 1) {
        // inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        // pinta la línea
        for (int i = 0; i < asteriscos; i++) {
          System.out.print(caracter);
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        asteriscos -= 2;      
      } // while parte de arriba //
      
      // parte de abajo //
      espaciosPorDelante = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        for (int i = 0; i < asteriscos; i++) {
          System.out.print(caracter);
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        asteriscos += 2;
        
      } System.out.println();// while parte de abajo //
    } // else
    }
    
  }
}

public class ej19 {
  public static void main(String[] args) {
    System.out.println("Puedo dibujar pirámides");
    System.out.print("Introduce la altura de la piramide: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el carácter de la piramide: ");
    String caracter = System.console().readLine();    
    int caracteresPorFila = 1;
    int espaciosDelanteros = altura;
    
    //Cálculo
    for (int i  = 0; i < altura; i++) {
      //Espacios delanteros en cada fila
      for (int j = 0; j < espaciosDelanteros; j++ ) {
        System.out.print(" ");
      }
      //Pinta la fila
      for (int j = 0; j < caracteresPorFila ; j++) {
        System.out.print(caracter);
      }
      System.out.println();
      caracteresPorFila += 2;
      espaciosDelanteros--;
    }
  }
}

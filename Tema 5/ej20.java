public class ej19 {
  public static void main(String[] args) {
    System.out.println("Puedo dibujar pirámides");
    System.out.print("Introduce el caracter con el que dibujar la piramide: ");
    String caracter = System.console().readLine();
    System.out.print("Introduce la altura de la piramide: ");
    int altura = Integer.parseInt(System.console().readLine());
    int espaciosDelante = altura-1;
    
    //Cálculo
    for (int i = 0; i < altura; i++) {
      System.out.println(espaciosDelante + "" +caracter);
      espaciosDelante--;
    }
  }
}

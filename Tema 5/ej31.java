public class ej31 {
  public static void main(String[] args) {
    System.out.println("Puedo dibujar una L con diferente altura");
    System.out.println("Introduce la altura que desees: ");
    int h = Integer.parseInt(System.console().readLine());
    
    //Cálculo
    for (int i = 1; i < h; i++) {
      System.out.println("*");
    }
    for (int i = 0; i < h / 2 + 1; i++) {
      System.out.print("* ");
    }
    
  }
}

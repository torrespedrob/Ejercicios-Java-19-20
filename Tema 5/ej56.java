public class ej56 {
  public static void main(String[] args) {
    System.out.println("Puedo dibujar un triangulo relleno");
    System.out.print("Introduce la altura del triangulo: ");
    int h = Integer.parseInt(System.console().readLine());
    int espacios = 0;
    
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      
      for (int j = 0; j < h - i; j++) {
        System.out.print("*");
      }
      
      System.out.println();
      espacios++;
    }
  }
}

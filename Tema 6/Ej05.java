public class Ej05 { // Clase principal
  public static void main(String[] args) {
    System.out.println("50 numeros aleatorios entre 100 y 199");
    for (int i= 0; i < 50; i++) {
      System.out.println((int)(Math.random()*200));
    }
  }
}

public class Ej04 { // Clase principal
  public static void main(String[] args) {
    System.out.println("20 numeros aleatorios entre 0 y 10");
    for (int i= 0; i < 20; i++) {
      System.out.println((int)(Math.random()*11));
    }
  }
}

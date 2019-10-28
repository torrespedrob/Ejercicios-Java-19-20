public class Ej01 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Tirada de tres dados");
    int numero;
    for (int i = 0; i < 3; i++) {
      numero = (int)(Math.random()*6) +1;
      switch (numero) {
        case 1:
        System.out.println("⚀");
        break;
        case 2:
        System.out.println("\u2681");
        break;
        case 3:
        System.out.println("⚂");
        break;
        case 4:
        System.out.println("⚃");
        break;
        case 5:
        System.out.println("⚄");
        break;
        case 6:
        System.out.println("⚅");
        break;
        default:
        numero = 0;
      }
    }
  }
}

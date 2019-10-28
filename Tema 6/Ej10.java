public class Ej10 { // Clase principal
  public static void main(String[] args) {
    String caracter = "";
    //Pinta 10 lineas
    for (int i = 0; i < 10; i++) {
      int escogido = (int)(Math.random()*7 + 1);
      int longitud = (int)(Math.random()*41 + 1);
      switch (escogido) {
        case 1:
        caracter = "*";
        for (int x = 0; x < longitud; x++) {
          System.out.print(caracter);
        }
        break;
        case 2:
        caracter = "-";
        for (int x = 0; x < longitud; x++) {
          System.out.print(caracter);
        }
        break;
        case 3:
        caracter = "=";
        for (int x = 0; x < longitud; x++) {
          System.out.print(caracter);
        }
        break;
        case 4:
        caracter = ".";
        for (int x = 0; x < longitud; x++) {
          System.out.print(caracter);
        }
        break;
        case 5:
        caracter = "|";
        for (int x = 0; x < longitud; x++) {
          System.out.print(caracter);
        }
        break;
        case 6:
        caracter = "@";
        for (int x = 0; x < longitud; x++) {
          System.out.print(caracter);
        }
        break;
      }
      System.out.println("");
    }
  }
}

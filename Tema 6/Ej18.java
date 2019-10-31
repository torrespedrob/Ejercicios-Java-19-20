public class Ej18 { // Clase principal
  public static void main(String[] args) {
    //Genera colores aleatorios
    int generado1;
    int generado2;
    int generado3;
    String color1 = "";
    String color2 = "";
    String color3 = "";
    
    //Va generando hasta que sean distintos los 3 colores
    do {
      generado1 = (int)(Math.random()*6 + 1);
      generado2 = (int)(Math.random()*6 + 1);
      generado3 = (int)(Math.random()*6 + 1);
    } while ((generado1 == generado2) || (generado2 == generado3) || (generado3 == generado1));
    
    switch (generado1) {
      case 1:
        color1 = "rojo";
      break;
      case 2:
        color1 = "azul";
      break;
      case 3:
        color1 = "verde";
      break;
      case 4:
        color1 = "amarillo";
      break;
      case 5:
        color1 = "violeta";
      break;
      case 6:
        color1 = "naranja";
      break;
    }
    switch (generado2) {
      case 1:
        color2 = "rojo";
      break;
      case 2:
        color2 = "azul";
      break;
      case 3:
        color2 = "verde";
      break;
      case 4:
        color2 = "amarillo";
      break;
      case 5:
        color2 = "violeta";
      break;
      case 6:
        color2 = "naranja";
      break;
    }
    switch (generado3) {
      case 1:
        color3 = "rojo";
      break;
      case 2:
        color3 = "azul";
      break;
      case 3:
        color3 = "verde";
      break;
      case 4:
        color3 = "amarillo";
      break;
      case 5:
        color3 = "violeta";
      break;
      case 6:
        color3 = "naranja";
      break;
    }
    System.out.println("Los colores en los que he pensado son: ");
    System.out.print("El " + color1 + ", el " + color2 + " y el " + color3);
  }
}

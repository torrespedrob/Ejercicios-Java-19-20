public class Ej20 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo saber si un número es capicúa");
    System.out.println("Introduce un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    boolean capicua = false;
    
    if (numero < 10) {
      capicua = true;
    }
    
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        capicua = true;
      }
    }

    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
        capicua = true;
      }
    }

    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10)== (( numero / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("El número " + numero + " es capicúa.");
    } else {
      System.out.println("El número " + numero + " no es capicúa.");
    }
  }
}

public class Ej14 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo saber si un numero es par y si es divisible entre 5");
    System.out.println("Introduce un numero: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    boolean esPar = true;
    
    //Par y divisible entre 5
    if (numero1 % 2 != 0) {
      System.out.println("El numero introducido no es par");
    } else { 
      System.out.println("El numero introducido es par");
    }
    
    if (numero1 % 5 == 0) {
      System.out.println("El numero introducido es divisible entre 5");
    } else {
      System.out.println("El numero introducido no es divisible entre 5");
    }
  }
}

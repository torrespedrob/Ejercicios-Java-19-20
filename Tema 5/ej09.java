public class ej09 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo saber cuantos digitos tiene un número entero");
    System.out.println("Introduce un numero entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    int cuentaDigitos;
  
    
    //Cálculo
    while (numero != 0) {
      numero / 10;
      cuentaDigitos++;
    }
    System.out.println("Ese número tiene "+ cuentaDigitos + " dígitos")
  }
}

/*
 * do {
 * numero = numero / 10
 * cuentaDigitos++;
 * } while (numero > 0);

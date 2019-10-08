public class Ej13 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo ordenar tres numeros enteros");
    System.out.println("Introduce el primer numero: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el segundo numero: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el tercer numero: ");
    int numero3 = Integer.parseInt(System.console().readLine());
    int aux;
    //Ordenar
    if (numero1 > numero2) {
      aux = numero1;
      numero1 = numero2;
      numero2 = aux;
    }
    if (numero2 > numero3) {
      aux = numero2;
      numero2 = numero3;
      numero3 = aux;
    }
    if (numero1 > numero2) {
      aux = numero1;
      numero1 = numero2;
      numero2 = aux;
    }
    
    System.out.println("De menor a mayor: " + numero1 + "," + numero2 + "," + numero3);
  }
}

public class ej12 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Sucesión Fibonacci");
    System.out.println("Introduce un número: ");
    int entrada = Integer.parseInt(System.console().readLine());
    
    switch (entrada) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int auxiliar;
        
        while(entrada > 2) {
            auxiliar = fibonacci1;
            fibonacci1 = fibonacci2;
            fibonacci2 = auxiliar + fibonacci2;
            System.out.print(" " + fibonacci2);
            entrada--;
        }
    }
    System.out.println();
  }
}

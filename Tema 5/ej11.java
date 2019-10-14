public class ej11 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo mostrar el cuadrado y el cubo de un número introducido y sus 5 siguientes");
    System.out.println("Introduce un número: ");
    int entrada = Integer.parseInt(System.console().readLine());
    
    for (int i = entrada; i < entrada+5 ; i++) {
      System.out.printf("%4d %6d %7d\n", i, i*i, i*i*i);
    }
    
  }
}

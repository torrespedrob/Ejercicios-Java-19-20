public class ej29 {
  public static void main(String[] args) {
    System.out.println("Puedo mostrar todos los enteros inferiores a un número introducido");
    System.out.print("Introduce un número entero: ");
    int entrada = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduce un divisor: ");
    int divisor = Integer.parseInt(System.console().readLine());
    
    //Cálculo
    for (int i = 0; i < entrada; i++) {
      if ((i % divisor) == 0) {
        System.out.println(i);
      }
    }
  }
}

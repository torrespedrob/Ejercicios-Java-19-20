public class Ej05 {
  public static void main(String[] args) {
    System.out.println("Puedo resolver ecuaciones de primer grado como ax + b = 0");
    
    //Entrada de datos
    System.out.print("Introduce el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());

    //Salida
    if (a == 0) {
      System.out.println("No existe solucion para los datos introducidos");
    } else {
      System.out.println("x es igual a " + (-b/a));
    }
  }
}

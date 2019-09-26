public class Ej05 {
  public static void main(String[] args) {
    System.out.println("Puedo calcular el area de un rectangulo");
    System.out.println("Introduce la base: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce la altura: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    
    int area = numero1 * numero2;
    System.out.println("El area del rectangulo con base " + numero1 + " y altura " + numero2 + " es " + area);
  }
}

public class Ej06 {
  public static void main(String[] args) {
    System.out.println("Puedo calcular el area de un triangulo");
    System.out.println("Introduce la base: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce la altura: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    
    double area = ((double) numero1 * (double) numero2)/2;
    System.out.println("El area del triangulo con base " + numero1 + " y altura " + numero2 + " es " + area);
  }
}

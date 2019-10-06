public class Ej21 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo calcular la nota del trimestre de Programación");
    System.out.println("Introduce la nota del primer control: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la nota del segundo control: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    double media = (nota1 + nota2)/2;
    double notafinal;
    //Cálculos
    if (media < 5) {
      System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        notafinal = 5;
        System.out.println("Tu nota de programación es: " + notafinal);
      } else if (recuperacion.equals("no apto")) {
        notafinal = media;
        System.out.println("Tu nota de programación es: " + notafinal);
      } else {
        System.out.println("Se ha producido un error");
      }
    } else {
      notafinal = media;
      System.out.println("Tu nota de programación es: " + notafinal);
    }
        
  }
}

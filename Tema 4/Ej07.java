public class Ej07 {
  public static void main(String[] args) {
    System.out.println("Puedo calcular la media de tres notas: ");
    System.out.println("Introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    //Media
    double media = ((nota1 + nota2 + nota3)/3);
    System.out.printf("%-15s %-8.2f", "La media de tus notas es ", media);
  }
}

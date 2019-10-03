public class Ej08 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo calcular la media de tres notas");
    System.out.println("Introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    //Media
    double media = ((nota1 + nota2 + nota3)/3);
    System.out.printf("%-10s %-8.2f", "La media de tus notas es ", media);
    
    //Mensajes
    if ((media < 5 ) && (media >= 0)) {
      System.out.println("Lo siento, has sacado un insuficiente");
    }
    if ((media >= 5 ) && (media < 6)) {
      System.out.println("Has sacado un suficiente");
    }
    if ((media >= 6 ) && (media < 7)) {
      System.out.println("Has sacado un bien");
    }
    if ((media >= 7 ) && (media < 9)) {
      System.out.println("Enhorabuena, has sacado notable");
    }
    if ((media >= 9 ) && (media <= 10)) {
      System.out.println("Enhorabuena, has sacado sobresaliente");
    }
  }
}

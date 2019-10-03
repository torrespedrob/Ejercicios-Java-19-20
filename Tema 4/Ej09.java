public class Ej08 {
  public static void main(String[] args) {
    //Entrada
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
    
    //Switch de mensajes
    switch (media) {
      case (media < 5):
      System.out.println("Lo siento, has sacado insuficiente");
      break;
      case (media >= 5 && media < 6):
      System.out.println("Has sacado suficiente");
      break;
      case (media >= 6 && media < 7):
      System.out.println("Has sacado bien");
      break;
      case (media >= 7 && media < 9):
      System.out.println("Enhorabuena, has sacado un notable");
      break;
      case (media >= 9 && media <= 10):
      System.out.println("Enhorabuena, has sacado un sobresaliente");
      break;
      default:
      System.out.println("Algo ha salido mal");
    
    }
  }
}

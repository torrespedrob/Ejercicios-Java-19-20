public class Ej12 {
  public static void main(String[] args) {
    System.out.println("Calcula tu nota deseada");
    System.out.print("Introduce tu nota en el primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota que deseas sacar en el trimestre: ");
    double notaDeseada = Double.parseDouble(System.console().readLine());
    double nota2 = ((notaDeseada * 100) - (nota1 * 40)) / 60;
    //La nota del primer examen solo cuenta un 40%
    
    System.out.println("Para sacar un " + notaDeseada + " necesitas sacar un " + nota2 + " en el proximo examen");
  }
}

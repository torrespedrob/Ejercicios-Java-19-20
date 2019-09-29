public class Ej08 {
  public static void main(String[] args) {
    System.out.println("¿Cuantas horas trabajas a la semana?: ");
    int horas = Integer.parseInt(System.console().readLine());
    int calculo = horas * 12;
    System.out.println("Tu salario es de " + calculo + " euros, ganando por cada hora unos 12");
  }
}

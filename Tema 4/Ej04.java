public class Ej04 {
  public static void main(String[] args) {
    System.out.println("¿Cuantas horas trabajas a la semana?: ");
    int horas = Integer.parseInt(System.console().readLine());
    int calculo;
    
    if (horas < 40) {
     calculo = horas * 12;
    } else {
     calculo =  ((horas - 40) * 16) + (40 * 12);
    }
  System.out.println("Tu salario es de " + calculo + " euros.");
  }
}

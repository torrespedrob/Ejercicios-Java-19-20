public class Ej06 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo saber el tiempo que tarda en caer un objeto con una altura h");
    System.out.println("Introduce la altura h: ");
    double h = Double.parseDouble(System.console().readLine());
    
    //Cálculo
    double dentroRaiz = (2 * h)/9.81;
    double resultado = Math.sqrt(dentroRaiz);
    
    //Salida
    System.out.printf("%-15s %-8.2f", "El resultado es: ", resultado);
    
  }
}

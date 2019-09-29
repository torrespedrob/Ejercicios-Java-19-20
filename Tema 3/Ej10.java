public class Ej10 {
  public static void main(String[] args) {
    System.out.println("Conversor de mb a kb");
    System.out.print("Introduce la cantidad de mb: ");
    
    double numero1 = Double.parseDouble(System.console().readLine());
    double conversion = numero1 * 1024;
    System.out.println(numero1 + "Mb equivalen a " +  conversion + "Kb.");
  }
}

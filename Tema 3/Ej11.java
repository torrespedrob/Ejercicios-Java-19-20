public class Ej11 {
  public static void main(String[] args) {
    System.out.println("Conversor de kb a mb");
    System.out.print("Introduce la cantidad de kb: ");
    
    double numero1 = Double.parseDouble(System.console().readLine());
    double conversion = numero1 / 1024;
    System.out.println(numero1 + "Kb equivalen a " +  conversion + "Mb.");
  }
}

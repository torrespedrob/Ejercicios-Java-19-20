public class Ej09 {
  public static void main(String[] args) {
    System.out.println("Calcula el volumen de un cono");
    System.out.println("Introduce la altura del cono, en centimetros: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el radio de la base del cono, en centimetros: ");
    double radio = Double.parseDouble(System.console().readLine());
    double pi = 3.141592;
    
    double volumen = (1.0/3.0) * pi * radio * radio * altura;
    System.out.println("El volumen del cono seria " + volumen + " cm cubicos");
  }
}

public class Ej09 {
  public static void main(String[] args) {
    System.out.println("Puedo resolver ecuaciones de segundo grado del tipo ax^2 + bx + c = 0");
    System.out.println("Introduce los valores de cada incógnita");
    
    //Entrada
    System.out.print("a = ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("b = ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("c = ");
    double c = Double.parseDouble(System.console().readLine());
    
    //Condicionales
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("Esta ecuación tiene infinitas soluciones.");
    }
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("Esta ecuación no tiene solución.");
    }
      
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("Valor 1 = 0");
      System.out.println("Valor 2 = " + (-b / a));
    }

    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("Valor 1 = Valor 2 = " + (-c / b));
    }

    //Cálculo
    if ((a != 0) && (b != 0) && (c != 0)) {
        
      double disc = b*b - (4 * a * c);
      
      if (disc < 0) {
          System.out.println("Esta ecuación no tiene soluciones reales");
      }  else {
        System.out.println("Valor 1 = " + (-b + Math.sqrt(disc))/(2 * a));
        System.out.println("Valor 2 = " + (-b - Math.sqrt(disc))/(2 * a));
      }
    }
  }
}


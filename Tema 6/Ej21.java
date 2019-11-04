public class Ej21 { // Clase principal
  public static void main(String[] args) {
    //Creacion de variables para aleatorizacion
    int cent2;
    int cent20;
    int cent50;
    int eur1;
    int eur2;
    String lado;
    
    //Aleatorizacion de cara o cruz
    cent2 = (int)(Math.random() * 2);
    cent20 = (int)(Math.random() * 2);
    cent50 = (int)(Math.random() * 2);
    eur1 = (int)(Math.random() * 2);
    eur2 = (int)(Math.random() * 2);
    
    //Asignacion y salida
    if (cent2 == 0) {
      lado = "cara";
      System.out.println("2 centimos - " + lado);
    } else {
      lado = "cruz";
      System.out.println("2 centimos - " + lado);
    }
    if (cent20 == 0) {
      lado = "cara";
      System.out.println("20 centimos - " + lado);
    } else {
      lado = "cruz";
      System.out.println("20 centimos - " + lado);
    }
    if (cent50 == 0) {
      lado = "cara";
      System.out.println("50 centimos - " + lado);
    } else {
      lado = "cruz";
      System.out.println("50 centimos - " + lado);
    }
    if (eur1 == 0) {
      lado = "cara";
      System.out.println("1 euro - " + lado);
    } else {
      lado = "cruz";
      System.out.println("1 euro - " + lado);
    }
    if (eur2 == 0) {
      lado = "cara";
      System.out.print("2 euros - " + lado);
    } else {
      lado = "cruz";
      System.out.print("2 euros - " + lado);
    }
  }
}

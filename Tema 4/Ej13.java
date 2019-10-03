public class Ej10 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo saber tu horóscopo según tu día y mes de nacimiento");
    System.out.println("Introduce tu mes de nacimiento (de 1 a 12): ");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce tu dia de nacimiento (de 1 a 31): ");
    int dia = Integer.parseInt(System.console().readLine());
    
    //Switch con opciones
    switch (mes) {
      case 1:
      if (dia >= 1 && dia <= 20) {
        System.out.println("Eres Capricornio");
      } else if (dia > 20 && dia <= 31){
        System.out.println("Eres Acuario");
      }
      break;
      case 2:
      if (dia >= 1 && dia <= 19) {
        System.out.println("Eres Acuario");
      } else if (dia > 19 && dia <= 28) {
        System.out.println("Eres Piscis");
      }
      break;
      case 3:
      if (dia >=1 && <= 20) {
        System.out.println("Eres Piscis");
      } else if (dia > 20 && dia <= 31) {
        System.out.println("Eres Aries");
      }
      break;
      case 4:
      if (dia >=1 && <=20) {
        System.out.println("Eres Aries");
      } else if (dia > 20 && dia <= 31) {
        System.out.println("Eres Tauros");
      }
      break;
      case 5:
      if (dia >= 1 && dia <)
  }
}
